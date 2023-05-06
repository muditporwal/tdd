package com.tdd.recursion;

public class Fibanacci {
  private Fibanacci() {}

  public static int numberAtIndex(int i) {
    if(i<1) throw new IllegalArgumentException("Invalid input for finding out Fibonacci number at index");
    if (i == 1 || i == 2) return 1;
    else return numberAtIndex(i - 1) + numberAtIndex(i - 2);
  }
}
