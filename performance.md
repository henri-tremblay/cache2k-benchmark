# On 10g (Ehcache 3.5.3-SNAPSHOT)

Benchmark                                                                    (cacheFactory)  (entryCount)  (factor)   Mode  Cnt        Score        Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory        100000         5  thrpt   12  1344063.304 ±  28110.544  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory        100000        10  thrpt   12  1032242.016 ±  14668.160  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory        100000        20  thrpt   12   832066.497 ±  29420.965  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory       1000000         5  thrpt   12  1469623.413 ± 193517.588  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory       1000000        10  thrpt   12  1023289.057 ±  82614.106  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory       1000000        20  thrpt   12   715367.599 ±  78610.707  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory      10000000         5  thrpt   12   772707.842 ± 411038.658  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory      10000000        10  thrpt   12   633435.555 ± 434272.356  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory      10000000        20  thrpt   12   708685.455 ± 480483.624  ops/s

Benchmark                                                        (cacheFactory)  (entryCount)  (factor)   Mode  Cnt        Score        Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory        100000         5  thrpt   12  2664765.429 ±  47887.308  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory        100000        10  thrpt   12  2139808.892 ±  24417.566  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory        100000        20  thrpt   12  1798732.252 ±  17356.806  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory       1000000         5  thrpt   12  2807340.415 ±  16793.761  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory       1000000        10  thrpt   12  2292189.737 ±  34302.837  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory       1000000        20  thrpt   12  1967894.139 ±  37864.453  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory      10000000         5  thrpt   12   793290.506 ± 129633.538  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory      10000000        10  thrpt   12   564285.453 ± 130613.188  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory      10000000        20  thrpt   12   455725.893 ±  87696.403  ops/s

# Ehcache 3.5.2

ReadOnlyBenchmark' -jvmArgs '-server -Xmx4G -XX:BiasedLockingStartupDelay=0' -f 2 -wi 5 -w 5s -i 3 -r 10s -foe true -t 4

Benchmark                                                            (cacheFactory)  (hitRate)   Mode  Cnt         Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory        100  thrpt    6  42207219.200 ± 1019255.296  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         50  thrpt    6  53841881.752 ± 1303042.743  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         33  thrpt    6  54676905.919 ± 6081587.551  ops/s

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt    6  11710697.679 ± 2041974.912  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt    6  17571563.486 ± 1736281.977  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt    6  20411234.698 ± 3060075.042  ops/s

# Ehcache 3.5.3-SNAPSHOT d8c256d7f

ReadOnlyBenchmark' -jvmArgs '-server -Xmx4G -XX:BiasedLockingStartupDelay=0' -f 4 -wi 5 -w 5s -i 3 -r 5s -foe true -t 4

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt   12  11111171.333 ± 1628165.253  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt   12  16939863.213 ± 1790600.808  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt   12  20075812.997 ± 2132356.678  ops/s

# Ehcache 3.5.3-SNAPSHOT no store observer (10% faster)

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt   12  12366644.902 ± 1856690.798  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt   12  17572529.992 ± 2017504.623  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt   12  20853941.841 ± 3803749.542  ops/s

# Ehcache 3.5.3-SNAPSHOT no stats, access time, checks

ReadOnlyBenchmark' -jvmArgs '-server -Xmx10G -XX:BiasedLockingStartupDelay=0' -f 4 -wi 5 -w 5s -i 3 -r 5s -foe true -t 4

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt          Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt   12  104787611.905 ± 13722185.709  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt   12  140528855.107 ± 11060256.087  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt   12  163170578.072 ± 14413469.022  ops/s

Benchmark                                                            (cacheFactory)  (hitRate)   Mode  Cnt          Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory        100  thrpt   12  168526266.271 ± 2627810.942  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         50  thrpt   12  216565053.216 ± 2737368.751  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         33  thrpt   12  228136281.495 ± 2659888.417  ops/s

# Ehcache 3.5.3-SNAPSHOT no stats, access time, checks. NBHM

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt   12  73572488.776 ± 3892513.359  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt   12  80577073.207 ± 3093487.294  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt   12  84963911.645 ± 2755020.190  ops/s

Benchmark                                                            (cacheFactory)  (hitRate)   Mode  Cnt          Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory        100  thrpt   12   88654225.775 ± 7705811.046  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         50  thrpt   12  117335033.365 ± 5140494.306  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         33  thrpt   12  119871595.277 ± 3406083.704  ops/s

# Change the benchmark to return the entry

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt          Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt   12  208813158.724 ± 16128710.297  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt   12  182543933.428 ± 35131022.094  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt   12  164998341.952 ± 42826760.672  ops/s

Benchmark                                                            (cacheFactory)  (hitRate)   Mode  Cnt          Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory        100  thrpt   12  163722887.719 ± 1622657.012  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         50  thrpt   12  205245511.783 ± 2955261.192  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory         33  thrpt   12  218353707.615 ± 4677614.064  ops/s

# Baseline

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt    4  41353721.827 ± 16581422.353  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt    4  63187941.876 ±  3301771.676  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt    4  80562479.548 ± 35779981.794  ops/s

# Remove stats

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt    4  47935804.532 ± 17757527.110  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt    4  65226385.844 ± 26300597.643  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt    4  83560715.136 ± 36556499.724  ops/s

# Remove checks on key

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt    4  44122461.699 ± 16251679.663  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt    4  62140569.171 ± 26947663.010  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt    4  79349787.628 ± 31664074.315  ops/s

# Remove access time maintenance

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  78450329.111 ± 39825493.466  ops/s

# Remove status check

Benchmark                                                                        (cacheFactory)  (hitRate)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        100  thrpt    4  42700037.934 ± 16947911.497  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         50  thrpt    4  63714151.979 ± 20435195.293  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory         33  thrpt    4  78132562.458 ± 11132973.607  ops/s
