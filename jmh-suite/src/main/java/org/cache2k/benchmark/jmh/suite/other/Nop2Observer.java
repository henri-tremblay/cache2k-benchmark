package org.cache2k.benchmark.jmh.suite.other;

import org.terracotta.statistics.observer.OperationObserver;

/**
 * @author Henri Tremblay
 */
public final class Nop2Observer {

  @SuppressWarnings("rawtype")
  private static final OperationObserver<?> OBSERVER = new OperationObserver() {
    @Override
    public void begin() {

    }

    @Override
    public void end(Enum anEnum) {

    }
  };

  @SuppressWarnings("unchecked")
  public static <T extends Enum<T>> OperationObserver<T> observer() {
    return (OperationObserver<T>) OBSERVER;
  };

  private Nop2Observer() {}
}
