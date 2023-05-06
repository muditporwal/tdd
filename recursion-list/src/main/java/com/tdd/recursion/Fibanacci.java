package com.tdd.recursion;

import java.math.BigInteger;
import java.util.HashMap;

public class Fibanacci {
  private static final HashMap<Integer, BigInteger> states = new HashMap<>();

  private Fibanacci() {}

  public static BigInteger numberAtIndex(int i) {
    if (i < 1)
      throw new IllegalArgumentException("Invalid input for finding out Fibonacci number at index");
    if (i == 1 || i == 2) return BigInteger.ONE;
    else {
      BigInteger fibAtIndex = states.getOrDefault(i, null);
      if (fibAtIndex == null) {
        BigInteger im1 = numberAtIndex(i - 1);
        BigInteger im2 = numberAtIndex(i - 2);
        fibAtIndex = im1.add(im2);
      }
      return fibAtIndex;
    }
  }
}
