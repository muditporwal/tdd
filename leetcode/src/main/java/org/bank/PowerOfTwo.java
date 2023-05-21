package org.bank;

class PowerOfTwo {
  public static Boolean isPowerOfTwo(int i) {
    if (i <= 0) throw new IllegalArgumentException("value must be greater than 0");
    else if (i == 1) return true;
    return null;
  }
}
