package com.tdd.recursion.tailsum;

import java.math.BigInteger;

class TailSum {
  public static BigInteger sum(BigInteger val) {
    if (BigInteger.ZERO.compareTo(val) > 0)
      throw new IllegalArgumentException("Number cannot be negative for a sum till zero");
    return sum(BigInteger.ZERO, val);
  }

  private static BigInteger sum(BigInteger acc, BigInteger val) {
    return acc.add(val);
  }

  public static void main(String[] args) {
    assert (BigInteger.ZERO.compareTo(sum(BigInteger.ZERO, BigInteger.ZERO)) == 0);
    assert (BigInteger.ONE.compareTo(sum(BigInteger.ZERO, BigInteger.ONE)) == 0);
    assert (BigInteger.valueOf(3).compareTo(sum(BigInteger.ZERO, BigInteger.TWO)) == 0);
  }
}
