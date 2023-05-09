package com.tdd.recursion;

public class MathMax {
  public static int apply(Integer index, int[] a) {
    if (a.length == 0) return Integer.MIN_VALUE;
    if (a.length == 1) return a[0];
    else return -1;
  }
}
