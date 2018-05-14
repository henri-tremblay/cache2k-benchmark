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

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
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
public class HazelcastFactory extends BenchmarkCacheFactory {

  private static final String CACHE_NAME = "testCache";

  @Override
  public BenchmarkCache<Integer, Integer> create(int _maxElements) {
    return new MyBenchmarkCache(_maxElements);
  }

  private CacheConfigurationBuilder<Integer,Integer> createCacheConfiguration(int _maxElements) {
    return CacheConfigurationBuilder.newCacheConfigurationBuilder(Integer.class, Integer.class,
      ResourcePoolsBuilder.heap(_maxElements));
  }

  @SuppressWarnings("unchecked")
  @Override
  public <K, V> LoadingBenchmarkCache<K, V> createLoadingCache(Class<K> _keyType, Class<V> _valueType, int _maxElements, BenchmarkCacheSource<K, V> _source) {
    // TODO: Cache loading

    return (LoadingBenchmarkCache<K, V>) new MyLoadingBenchmarkCache(_maxElements);
  }

  class MyBenchmarkCache extends BenchmarkCache<Integer, Integer> {

    final int size;
    CacheConfiguration config;
    IMap<Integer,Integer> cache;
    HazelcastInstance hzInstance;

    MyBenchmarkCache(int size) {
      this.size = size;
      hzInstance = Hazelcast.newHazelcastInstance();
      cache = hzInstance.getMap(CACHE_NAME);
    }

    @Override
    public int getCacheSize() {
      return size;
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
      hzInstance.shutdown();
    }

    @Override
    public String toString() {
      return cache.toString();
    }

  }

  class MyLoadingBenchmarkCache extends LoadingBenchmarkCache<Integer, Integer> {

    final int size;
    IMap<Integer,Integer> cache;
    HazelcastInstance hzInstance;

    MyLoadingBenchmarkCache(int size) {
      this.size = size;
      hzInstance = Hazelcast.newHazelcastInstance();
      cache = hzInstance.getMap(CACHE_NAME);
    }

    @Override
    public int getCacheSize() {
      return size;
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
      hzInstance.shutdown();
    }

  }
}
