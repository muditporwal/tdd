package com.tdd.recursion.factorial;

public class Factorial {
  public static int get(int i) {
    if (i < 0)
      throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
    if (i == 0 || i == 1) return 1;
    return 0;
  }
}
