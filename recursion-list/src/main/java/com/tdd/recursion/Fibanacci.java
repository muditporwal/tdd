package com.tdd.recursion;

import java.util.HashMap;

public class Fibanacci {
  private static final HashMap<Integer, Integer> states = new HashMap<>();

  private Fibanacci() {}

  public static int numberAtIndex(int i) {
    if (i < 1)
      throw new IllegalArgumentException("Invalid input for finding out Fibonacci number at index");
    if (i == 1 || i == 2) return 1;
    else {
      Integer fibAtIndex = states.getOrDefault(i, null);
      if (fibAtIndex == null) fibAtIndex = numberAtIndex(i - 1) + numberAtIndex(i - 2);
      return fibAtIndex;
    }
  }
}
