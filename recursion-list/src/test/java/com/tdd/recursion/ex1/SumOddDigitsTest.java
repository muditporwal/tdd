package com.tdd.recursion.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOddDigitsTest {

  @Test
  void testInitialization() {
    SumOddDigits sod = new SumOddDigits(235);
    assertNotNull(sod);
  }

  @Test
  void testConversionToDigits() {
    SumOddDigits sod = new SumOddDigits(235);
    int[] digits = sod.getDigits();
    assertEquals(5, digits[0]);
    assertEquals(3, digits[1]);
    assertEquals(2, digits[2]);
  }
}
