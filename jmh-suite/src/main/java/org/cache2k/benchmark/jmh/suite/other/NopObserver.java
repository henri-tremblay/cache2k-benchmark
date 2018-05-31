package org.cache2k.benchmark.jmh.suite.other;

import org.terracotta.statistics.observer.OperationObserver;

/**
 * @author Henri Tremblay
 */
public final class NopObserver<T extends Enum<T>> implements OperationObserver<T> {

  @SuppressWarnings("rawtype")
  private static final OperationObserver<?> OBSERVER = new NopObserver();

  @SuppressWarnings("unchecked")
  public static <T extends Enum<T>> OperationObserver<T> observer() {
    return (OperationObserver<T>) OBSERVER;
  };

  private NopObserver() {}

  @Override
  public void begin() {

  }

  @Override
  public void end(T result) {

  }
}
