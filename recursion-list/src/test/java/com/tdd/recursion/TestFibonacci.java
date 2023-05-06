package com.tdd.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class TestFibonacci {
  @Test
  void testFibonacciForSeedValues() {
    int a = Fibanacci.numberAtIndex(1);
    assertEquals(1, a);
    a = Fibanacci.numberAtIndex(2);
    assertEquals(1, a);
  }

  @Test
  void testFibonacciNumberForInvalidIndex() {
    assertThrowsExactly(IllegalArgumentException.class, () -> Fibanacci.numberAtIndex(0));
    assertThrowsExactly(IllegalArgumentException.class, () -> Fibanacci.numberAtIndex(-1));
  }

  @Test
  void testFibonacciForSmallIntegerValues() {
    int a = Fibanacci.numberAtIndex(3);
    assertEquals(2, a);
  }
}
