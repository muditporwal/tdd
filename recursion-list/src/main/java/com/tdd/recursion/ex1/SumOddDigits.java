package com.tdd.recursion.ex1;

public class SumOddDigits {

  private final int number;

  public SumOddDigits(int number) {
    this.number = number;
  }

  public int[] getDigits() {
    if (isBaseCase()) {
      return getBaseCase();
    } else {
      return null;
    }
  }

  private int[] getBaseCase() {
    int[] ints = new int[1];
    ints[0] = number;
    return ints;
  }

  private boolean isBaseCase() {
    return number / 10 == 0;
  }
}
