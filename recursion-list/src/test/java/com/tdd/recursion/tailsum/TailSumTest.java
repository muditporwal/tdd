package com.tdd.recursion.tailsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class TailSumTest {
  @Test
  void testSmallValue() {
    BigInteger sum = TailSum.sum(BigInteger.ONE);
    assertEquals(BigInteger.ONE, sum);
  }

  @Test
  void testRecursion() {
    BigInteger sum = TailSum.sum(BigInteger.TWO);
    assertEquals(BigInteger.valueOf(3), sum);
  }
}
