package com.tdd.recursion.ex1;

public class SumOddDigits {

  private final int number;

  public SumOddDigits(int number) {
    this.number = number;
  }

  public int[] getDigits() {
    if (number / 10 == 0) {
      int[] ints = new int[1];
      ints[0] = number;
      return ints;
    }
    return null;
  }
}
