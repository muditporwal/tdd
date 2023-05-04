package com.tdd.recursion.factorial;

public class Factorial {
  private Factorial() {
  }

  public static int compute(int i) {
    if (i < 0)
      throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
    if (i == 0 || i == 1) return 1;
    else {
      return i * compute(i - 1);
    }
  }
}
