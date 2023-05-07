package com.tdd.recursion.tailsum;

import java.math.BigInteger;

class TailSum {
  public static BigInteger sum(BigInteger val) {
    return sum(BigInteger.ZERO, val);
  }

  public static BigInteger sum(BigInteger acc, BigInteger val) {
    // if (BigInteger.ZERO.compareTo(val)>0)
    return acc.add(val);
  }
}
