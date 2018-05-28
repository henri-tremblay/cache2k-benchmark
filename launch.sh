#!/bin/bash

set -e;
set -x;

test -n "$JAVA" || JAVA=java

#ALGORITHM=ZipfianLoopingPrecomputedSequenceLoadingBenchmark
#ALGORITHM=ZipfianSequenceLoadingBenchmark
ALGORITHM=ReadOnlyBenchmark

CACHE_FACTORY_LIST=""
CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.thirdparty.EhCache3Factory"
#CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.thirdparty.CaffeineCacheFactory"
#CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.thirdparty.GuavaCacheFactory"
#CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.thirdparty.InfinispanCacheFactory"
#CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.thirdparty.TCache1Factory"
#CACHE_FACTORY_LIST="$CACHE_FACTORY_LIST org.cache2k.benchmark.Cache2kFactory"

JVM_ARGS="-server -Xmx10G -XX:BiasedLockingStartupDelay=0"

# Arguments:
# -f: How many forks
# -wi: Number of warmup iterations
# -i: Number of iterations
# -r: Minimum time to spend in an iteration
# -foe: Fail immediately in case of error
BENCHMARK_QUICK="-f 2 -wi 5 -w 2s -i 2 -r 5s -foe true"
BENCHMARK_PERF="-f 1 -wi 5 -w 2s -i 1 -r 30s -foe true"
BENCHMARK_DILIGENT="-f 4 -wi 5 -w 5s -i 3 -r 20s -foe true"
BENCHMARK_LONG="-f 1 -wi 5 -w 2s -i 1 -r 500s -foe true"

OPTIONS=$BENCHMARK_QUICK

# Possible profiles
# -prof perfasm (linux only)
# -prof dtraceasm (osx)
# -prof gc
# -prof comp
# -prof stack
# -prof hs_rt
# -prof hs_gc

PROFILERS=""

for I in $CACHE_FACTORY_LIST; do
  for threads in 16; do
    $JAVA -jar jmh-suite/target/benchmarks.jar \\.${ALGORITHM} -jvmArgs "$JVM_ARGS" $OPTIONS $PROFILERS \
           -t $threads -p cacheFactory=$I \
           -rf json -rff "${I}.json" \
           2>&1 | tee ${I}.out
  done
done