package com.tdd.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class TestFibonacci {
  @Test
  void testFibonacciForSeedValues() {
    BigInteger a = Fibanacci.numberAtIndex(1);
    assertEquals(BigInteger.ONE, a);
    a = Fibanacci.numberAtIndex(2);
    assertEquals(BigInteger.ONE, a);
  }

  @Test
  void testFibonacciNumberForInvalidIndex() {
    assertThrowsExactly(IllegalArgumentException.class, () -> Fibanacci.numberAtIndex(0));
    assertThrowsExactly(IllegalArgumentException.class, () -> Fibanacci.numberAtIndex(-1));
  }

  @Test
  void testFibonacciForSmallIntegerValues() {
    BigInteger a = Fibanacci.numberAtIndex(3);
    assertEquals(BigInteger.TWO, a);
  }

  @Test
  void testFibonacciForBigIntegerValues() {
    BigInteger a = Fibanacci.numberAtIndex(30);
    // TODO: Implement memoization keeps running
    assertEquals(BigInteger.TWO, a);
  }
}
