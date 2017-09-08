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
import org.cache2k.benchmark.BenchmarkCacheSource;
import org.cache2k.benchmark.LoadingBenchmarkCache;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.ResourceType;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.spi.loaderwriter.CacheLoaderWriter;

import java.time.Duration;
import java.util.Map;

/**
 * @author Jens Wilke; created: 2013-12-08
 */
public class EhCache3Factory extends BenchmarkCacheFactory {

  private static final String CACHE_NAME = "testCache";

  @Override
  public BenchmarkCache<Integer, Integer> create(int _maxElements) {
    return new MyBenchmarkCache(createCacheConfiguration(_maxElements));
  }

  private CacheConfigurationBuilder<Integer,Integer> createCacheConfiguration(int _maxElements) {
    return CacheConfigurationBuilder.newCacheConfigurationBuilder(Integer.class, Integer.class,
      ResourcePoolsBuilder.heap(_maxElements));
  }

  @SuppressWarnings("unchecked")
  @Override
  public <K, V> LoadingBenchmarkCache<K, V> createLoadingCache(Class<K> _keyType, Class<V> _valueType, int _maxElements, BenchmarkCacheSource<K, V> _source) {
    CacheConfigurationBuilder<Integer, Integer> conf = createCacheConfiguration(_maxElements)
        .withLoaderWriter(new CacheLoaderWriter<Integer, Integer>() {
          @Override
          public Integer load(Integer key) {
            return (Integer) _source.load((K) key);
          }

          @Override
          public Map<Integer, Integer> loadAll(Iterable<? extends Integer> keys) {
            throw new UnsupportedOperationException();
          }

          @Override
          public void write(Integer key, Integer value) {
            throw new UnsupportedOperationException();
          }

          @Override
          public void writeAll(Iterable<? extends Map.Entry<? extends Integer, ? extends Integer>> entries) {
            throw new UnsupportedOperationException();
          }

          @Override
          public void delete(Integer key) {
            throw new UnsupportedOperationException();
          }

          @Override
          public void deleteAll(Iterable<? extends Integer> keys) {
            throw new UnsupportedOperationException();
          }
        });

    if (withExpiry) {
      conf = conf.withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofMinutes(5)));
    }

    return (LoadingBenchmarkCache<K, V>) new MyLoadingBenchmarkCache(conf);
  }

  class MyBenchmarkCache extends BenchmarkCache<Integer, Integer> {

    CacheConfiguration config;
    org.ehcache.Cache<Integer,Integer> cache;
    org.ehcache.CacheManager manager;

    MyBenchmarkCache(CacheConfigurationBuilder<Integer, Integer> cfg) {
      this.config = cfg.build();
      manager = CacheManagerBuilder.newCacheManagerBuilder().build(true);
      cache = manager.createCache(CACHE_NAME, cfg);
    }

    @Override
    public int getCacheSize() {
      return (int) config.getResourcePools().getPoolForResource(ResourceType.Core.HEAP).getSize();
    }

    @Override
    public Integer getIfPresent(Integer key) {
      return cache.get(key);
    }

    @Override
    public void put(final Integer key, final Integer value) {
      cache.put(key, value);
    }

    @Override
    public void close() {
      manager.close();
    }

    @Override
    public String toString() {
      return cache.toString();
    }

  }

  class MyLoadingBenchmarkCache extends LoadingBenchmarkCache<Integer, Integer> {

    CacheConfiguration<Integer,Integer> config;
    org.ehcache.Cache<Integer,Integer> cache;
    org.ehcache.CacheManager manager;

    MyLoadingBenchmarkCache(CacheConfigurationBuilder<Integer,Integer> cfg) {
      this.config = cfg.build();
      manager = CacheManagerBuilder.newCacheManagerBuilder().build(true);
      cache = manager.createCache(CACHE_NAME, cfg);
    }

    @Override
    public int getCacheSize() {
      return (int) config.getResourcePools().getPoolForResource(ResourceType.Core.HEAP).getSize();
    }

    @Override
    public Integer get(final Integer key) {
      return cache.get(key);
    }

    @Override
    public void put(final Integer key, final Integer value) {
      cache.put(key, value);
    }

    @Override
    public void close() {
      manager.close();
    }

  }
}
