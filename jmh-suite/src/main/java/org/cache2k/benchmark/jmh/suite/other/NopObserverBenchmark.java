package org.cache2k.benchmark.jmh.suite.other;

import org.ehcache.core.statistics.StoreOperationOutcomes;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.terracotta.statistics.observer.OperationObserver;

import java.util.concurrent.TimeUnit;

/**
 * @author Henri Tremblay
 */
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class NopObserverBenchmark {
  private final OperationObserver<StoreOperationOutcomes.GetOutcome> get1 = NopObserver.observer();
  private final OperationObserver<StoreOperationOutcomes.GetOutcome> get2 = Nop2Observer.observer();
  private final OperationObserver<StoreOperationOutcomes.GetOutcome> get3 = Nop3Observer.observer();

  @Benchmark
  public void baseline() {
  }

  @Benchmark
  public void get1() {
    get1.begin();
    get1.end(StoreOperationOutcomes.GetOutcome.HIT);
  }

  @Benchmark
  public void get2() {
    get2.begin();
    get2.end(StoreOperationOutcomes.GetOutcome.HIT);
  }

  @Benchmark
  public void get3() {
    get3.begin();
    get3.end(StoreOperationOutcomes.GetOutcome.HIT);
  }
}
