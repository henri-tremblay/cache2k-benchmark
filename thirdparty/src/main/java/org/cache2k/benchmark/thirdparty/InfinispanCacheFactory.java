package org.cache2k.benchmark.thirdparty;

/*
 * #%L
 * Benchmarks: third party products.
 * %%
 * Copyright (C) 2013 - 2017 headissue GmbH, Munich
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.cache2k.benchmark.BenchmarkCache;
import org.cache2k.benchmark.BenchmarkCacheFactory;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.configuration.cache.StorageType;
import org.infinispan.eviction.EvictionStrategy;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.Cache;

import java.util.concurrent.TimeUnit;

/**
 * @author Jens Wilke; created: 2013-12-08
 */
public class InfinispanCacheFactory extends BenchmarkCacheFactory {

  static final String CACHE_NAME = "testCache";
  static EmbeddedCacheManager cacheManager;

  static synchronized EmbeddedCacheManager getCacheMangaer() {
    if (cacheManager == null) {
      cacheManager = new DefaultCacheManager();
    }
    return cacheManager;
  }

  @Override
  public BenchmarkCache<Integer, Integer> create(int _maxElements) {
    EmbeddedCacheManager m = getCacheMangaer();
    ConfigurationBuilder cb = new ConfigurationBuilder();

    cb.memory()
      .size(_maxElements)
      .storageType(StorageType.BINARY)
      .eviction()
        .strategy(EvictionStrategy.LRU);

    if (!withExpiry) {
      cb.expiration().disableReaper().lifespan(-1);
    } else {
      cb.expiration().lifespan(5 * 60, TimeUnit.SECONDS);
    }

    m.defineConfiguration(CACHE_NAME, cb.build());
    Cache<Integer, Integer> _cache = m.getCache(CACHE_NAME);
    return new MyBenchmarkCache(_cache);
  }

  static class MyBenchmarkCache extends BenchmarkCache<Integer, Integer> {

    Cache<Integer, Integer> cache;

    MyBenchmarkCache(Cache<Integer, Integer> cache) {
      this.cache = cache;
    }

    @Override
    public Integer getIfPresent(final Integer key) {
      return cache.get(key);
    }

    @Override
    public void put(Integer key, Integer value) {
      cache.put(key, value);
    }

    @Override
    public void close() {
      cache.getCacheManager().removeCache(CACHE_NAME);
    }

    @Override
    public int getCacheSize() {
      return (int) cache.getCacheConfiguration().memory().size();
    }

    @Override
    public String toString() {
      return cache.toString() + ": size=" + cache.size();
    }

  }

}
