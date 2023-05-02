package com.tdd.recursion.ex1;

public class SumOddDigits {

  private final int number;

  public SumOddDigits(int number) {
    this.number = number;
  }

  public static int[] getDigits(int number) {
    if (isBaseCase(number)) return getBaseCase(number);
     else {
      return null;
    }
  }

  private static int[] getBaseCase(int number) {
    int[] ints = new int[1];
    ints[0] = number;
    return ints;
  }

  private static boolean isBaseCase(int number) {
    return number / 10 == 0;
  }
}
