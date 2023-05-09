package com.tdd.recursion;

public class MathMax {
  private MathMax() {}

  @SuppressWarnings("ManualMinMaxCalculation")
  public static int apply(Integer index, int[] a) {
    int ind;
    if (index == null) ind = 0;
    else ind = index;

    if (a.length == 0) return Integer.MIN_VALUE;
    if (a.length - ind == 1) return a[ind];
    else {
      int max = apply(ind + 1, a);
      if (max < a[ind]) return a[ind];
      else return max;
    }
  }
}
