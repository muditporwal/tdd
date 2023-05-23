package org.bank;

class PowerOfThree {
  private PowerOfThree() {}

  public static boolean isPowerOfThree(int i) {
    if (i <= 0) throw new IllegalArgumentException("value must be greater than 0");
    else if (i == 1) return true;
    else if (i % 3 != 0) return false;
    else return isPowerOfThree(i / 3);
  }
}
