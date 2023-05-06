package com.tdd.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFibonacci {
  @Test
  void testFibonacciForSeedValues() {
    int a = Fibanacci.numberAtIndex(1);
    assertEquals(1, a);
  }
}
