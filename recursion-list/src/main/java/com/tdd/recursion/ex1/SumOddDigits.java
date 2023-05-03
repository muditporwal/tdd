package com.tdd.recursion.ex1;

import java.util.ArrayList;
import java.util.List;

public class SumOddDigits {

  private final int number;

  public SumOddDigits(int number) {
    this.number = number;
  }

  public static List<Integer> getDigits(int number) {
    if (isBaseCase(number)) return baseCase(number);
    else {
      return recursiveCase(number);
    }
  }

  private static List<Integer> recursiveCase(int number) {
    int head = number / 10;
    int tail = number % 10;
    List<Integer> digits = getDigits(tail);
    digits.addAll(getDigits(head));
    return digits;
  }

  private static List<Integer> baseCase(int number) {
    List<Integer> digits = new ArrayList<>();
    digits.add(number);
    return digits;
  }

  private static boolean isBaseCase(int number) {
    return number / 10 == 0;
  }

  public int getNumber() {
    return number;
  }

  public int getSumOfOddDigits() {
    List<Integer> digits = getDigits(this.number);
    int sum = 0;
    for (int i = 0; i < digits.size(); i = i + 2) {
      sum = sum + digits.get(i);
    }
    return sum;
  }
}
