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
