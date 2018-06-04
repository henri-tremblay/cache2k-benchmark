package org.cache2k.benchmark.jmh.suite.noEviction.symmetrical;

/*
 * #%L
 * Benchmarks: JMH suite.
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
import org.cache2k.benchmark.jmh.BenchmarkBase;
import org.cache2k.benchmark.thirdparty.EhCache3Factory;
import org.cache2k.benchmark.util.AccessPattern;
import org.cache2k.benchmark.util.RandomAccessPattern;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Prepopulate cache with 100k entries and access it in a random pattern
 * with different miss rates. The main aim of this benchmark is to check
 * how different miss rations influence the throughput.
 *
 * @author Jens Wilke
 */
@State(Scope.Benchmark)
public class ReadOnlyBenchmark extends BenchmarkBase {

  public static final int ENTRY_COUNT = 100 * 1000;
  public static final int PATTERN_COUNT = 1000 * 1000;

//  @Param({"100", "50", "33"})
  public int hitRate = 100;

  private final static AtomicInteger offset = new AtomicInteger(0);

  @State(Scope.Thread)
  public static class ThreadState {
    long index = offset.getAndAdd(PATTERN_COUNT / 16);
  }

  BenchmarkCache<Integer, Integer> cache;

  Integer[] ints;

  @Setup(Level.Iteration)
  public void setup() throws Exception {
    cache = getFactory().create(ENTRY_COUNT);
    ints = new Integer[PATTERN_COUNT];

    int origin = 0, rate = hitRate;
    if(hitRate == 0) {
      rate = 100;
      origin = ENTRY_COUNT;
    }

    AccessPattern _pattern = new RandomAccessPattern((int) (ENTRY_COUNT * (100D / rate)));

    for (int i = 0; i < PATTERN_COUNT; i++) {
      int next = _pattern.next();
      ints[i] = origin + next;
    }
    for (int i = 0; i < ENTRY_COUNT; i++) {
      cache.put(i, i);
    }
  }

  @TearDown(Level.Iteration)
  public void tearDown() {
    recordMemoryAndDestroy(cache);
  }

//  @Benchmark @BenchmarkMode(Mode.Throughput)
//  public Integer baseline(ThreadState threadState) {
//    int idx = (int) (threadState.index++ % PATTERN_COUNT);
//    Integer key = ints[idx];
//    return key;
//  }

  @Benchmark @BenchmarkMode(Mode.Throughput)
  public Integer read(ThreadState threadState) {
    int idx = (int) (threadState.index++ % PATTERN_COUNT);
    Integer key = ints[idx];
    Integer value = cache.getIfPresent(key);
    return value;
  }

  public static void main(String[] args) throws Exception {
    ReadOnlyBenchmark benchmark = new ReadOnlyBenchmark();
    benchmark.cacheFactory = EhCache3Factory.class.getName();
    benchmark.setup();
    ThreadState state = new ThreadState();
    benchmark.read(state);
    benchmark.tearDown();
  }
}
