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

# Baseline (-f 2 -wi 5 -w 2s -i 2 -r 5s -foe true)

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

# Missed only

Benchmark                                                                        (cacheFactory)   Mode  Cnt          Score   Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt       200178891.654          ops/s

# Not calling System.currentMillis

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  59776728.478 ± 19456712.949  ops/s

# Use TickingTimeSource

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  60001387.453 ± 27541530.603  ops/s

# Remove stats from Store

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  45237491.488 ± 11226625.324  ops/s

-> 9% faster

# Use NOOP observer for stats

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  46370670.952 ± 18418659.517  ops/s

-> 12% faster

# Remove HIT_UPDATER

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  33774026.049 ± 20280100.793  ops/s

-> Slower

# Use NOOP observer and CountingTimeSource

Benchmark                                                                        (cacheFactory)   Mode  Cnt        Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  2624880.954 ± 9632133.517  ops/s

# Use NOOP and a lambda time source

AtomicLong currentTime = new AtomicLong(0);
TimeSource timeSource = () -> currentTime.getAndIncrement();
      
Benchmark                                                                        (cacheFactory)   Mode  Cnt        Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  2972436.953 ± 9616643.206  ops/s

# Use NOOP and CountingTimeSource on a volatile instead of AtomicLong

Benchmark                                                                        (cacheFactory)   Mode  Cnt        Score         Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  1741961.479 ± 1237271.883  ops/s

-> Super slow

# NOOP and TickingTimeSource

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score           Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  59765239.009 ± 104872615.621  ops/s

# Dedicated for no expiration code (keeping NOOP and TickingTimeSource)

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  64462922.741 ± 76449839.649  ops/s

# State of the union

Benchmark                                                                        (cacheFactory)       Mode   Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory       thrpt    4   64449135.981 ± 90 600 815.971  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory                   thrpt    4  159831848.710 ±  6096369.716  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.GuavaCacheFactory     thrpt    4    9311315.102 ± 19518240.503  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory  thrpt    4   33007824.839 ± 60520795.706  ops/s

We beat caffeine and guava. We are still slower and less stable than Cache2k.

# Conditional expiry routine

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  61861030.056 ± 32436110.493  ops/s

# Same with MethodHandle

Benchmark                                                                        (cacheFactory)   Mode  Cnt         Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory  thrpt    4  64449135.446 ± 39993712.328  ops/s

# Another state of the union

Benchmark                                                                    (cacheFactory)       (entryCount)  (factor)   Mode  Cnt        Score         Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory             100000         5  thrpt    4  1636894.757 ± 5775550.299  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory             100000        10  thrpt    4  1527649.828 ± 5012961.763  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory             100000        20  thrpt    4  1413213.677 ± 2663370.465  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory            1000000         5  thrpt    4  2286276.308 ± 6622585.091  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory            1000000        10  thrpt    4  2346386.567 ± 3402675.256  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory            1000000        20  thrpt    4  2044170.701 ± 8844943.189  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory           10000000         5  thrpt    4   911470.111 ± 2286141.677  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory           10000000        10  thrpt    4   831163.179 ± 1469985.305  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.EhCache3Factory           10000000        20  thrpt    4   889365.321 ± 2380750.173  ops/s

Benchmark                                                                         (cacheFactory)  (entryCount)  (factor)   Mode  Cnt        Score         Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory        100000         5  thrpt    4  4485518.550 ± 1060011.713  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory        100000        10  thrpt    4  3163914.849 ± 1849204.129  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory        100000        20  thrpt    4  3253047.386 ± 1490094.866  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory       1000000         5  thrpt    4  3055092.258 ± 3441664.724  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory       1000000        10  thrpt    4  2916995.918 ±  781028.988  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory       1000000        20  thrpt    4  2455270.711 ± 1416251.189  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory      10000000         5  thrpt    4  1779940.522 ± 9170334.314  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory      10000000        10  thrpt    4  1331280.848 ± 7372144.648  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory      10000000        20  thrpt    4  1580573.128 ± 2710331.829  ops/s

Benchmark                                                        (cacheFactory)  (entryCount)  (factor)   Mode  Cnt        Score         Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                         100000         5  thrpt    4  6038095.966 ±  537899.540  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                         100000        10  thrpt    4  4650282.958 ±  602192.919  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                         100000        20  thrpt    4  3862124.888 ±  671211.314  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                        1000000         5  thrpt    4  5433638.592 ±  765516.119  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                        1000000        10  thrpt    4  4162129.644 ±  465895.328  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                        1000000        20  thrpt    4  3400575.280 ±   39625.985  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                       10000000         5  thrpt    4  1808464.518 ± 1933266.397  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                       10000000        10  thrpt    4  1352427.860 ± 1449337.056  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.Cache2kFactory                       10000000        20  thrpt    4  1111346.491 ± 1249410.208  ops/s

Benchmark                                                                      (cacheFactory)  (entryCount)  (factor)   Mode  Cnt        Score         Error  Units
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory           100000         5  thrpt    4  6817927.350 ±  403310.968  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory           100000        10  thrpt    4  6005365.394 ±  917800.711  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory           100000        20  thrpt    4  5457486.711 ±  898668.641  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory          1000000         5  thrpt    4  6769433.640 ±  416129.717  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory          1000000        10  thrpt    4  6068698.083 ±  317827.842  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory          1000000        20  thrpt    4  5572943.717 ±  328657.698  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory         10000000         5  thrpt    4  6329557.126 ±  980744.214  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory         10000000        10  thrpt    4  5611341.544 ± 1074960.773  ops/s
ZipfianSequenceLoadingBenchmark.operation  org.cache2k.benchmark.thirdparty.GuavaCacheFactory         10000000        20  thrpt    4  5162311.803 ± 1146018.631  ops/s

# Changing server to tc-perf-013.eur.ad.sag. Compare with CHM

Benchmark                                                                             (cacheFactory)   Mode  Cnt          Score          Error  Units
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory       thrpt    6   67 416 676.092 ± 23 083 468.495  ops/s <- 2 forks
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.CaffeineCacheFactory  thrpt    6   99 626 286.174 ± 48 898 933.956  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.GuavaCacheFactory     thrpt    6    7 556 089.204 ±  8 156 452.763  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory                   thrpt    6  210 752 880.797 ±  3 933 185.445  ops/s
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.HashMapFactory                   thrpt    6  550 831 643.635 ± 86 827 137.895  ops/s

noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory       thrpt   20   66 911 373.304 ±  5 214 378.328  ops/s <- 5 forks
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.Cache2kFactory                   thrpt   20  209 230 668.902 ±  3 855 382.006  ops/s

noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory       thrpt   40   66 600 003.079 ±  2 881 072.060  ops/s <- 10 forks

noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.thirdparty.EhCache3Factory        thrpt   20  66 827 692.873 ±  5 053 836.310  ops/s <- 10 forks 10 seconds
noEviction.symmetrical.ReadOnlyBenchmark.read  org.cache2k.benchmark.ConcurrentHashMapFactory          thrpt   20 521 046 175.400 ± 21 067 229.974  ops/s
