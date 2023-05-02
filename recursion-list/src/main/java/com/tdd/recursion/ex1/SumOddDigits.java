package com.tdd.recursion.ex1;

import java.util.ArrayList;
import java.util.List;

public class SumOddDigits {

  private final int number;

  public SumOddDigits(int number) {
    this.number = number;
  }

  public static List<Integer> getDigits(int number) {
    if (isBaseCase(number)) return getBaseCase(number);
    else {
      return null;
    }
  }

  private static List<Integer> getBaseCase(int number) {
    List<Integer> digits = new ArrayList<>();
    digits.add(number);
    return digits;
  }

  private static boolean isBaseCase(int number) {
    return number / 10 == 0;
  }
}
