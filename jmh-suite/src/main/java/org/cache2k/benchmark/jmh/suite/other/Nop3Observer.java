package org.cache2k.benchmark.jmh.suite.other;

import org.terracotta.statistics.observer.OperationObserver;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Henri Tremblay
 */
public final class Nop3Observer {

  @SuppressWarnings("unchecked")
  private static final OperationObserver<?> OBSERVER = (OperationObserver<?>) Proxy.newProxyInstance(
    Nop3Observer.class.getClassLoader(),
    new Class<?>[] { OperationObserver.class },
    (proxy, method, args) -> null);

  @SuppressWarnings("unchecked")
  public static <T extends Enum<T>> OperationObserver<T> observer() {
    return (OperationObserver<T>) OBSERVER;
  };

  private Nop3Observer() {}
}
