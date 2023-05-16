package org.bank;

import java.util.HashMap;
import java.util.Map;

class Fibonacci {

  private final Map<Integer, Integer> memoizedCache = new HashMap<>();

  public int fib(int i) {
    if (i == 1) return 1;
    if (i == 0) return 0;
    else return memoizedCache.computeIfAbsent(i, x -> fib(x - 1) + fib(x - 2));
  }
}
