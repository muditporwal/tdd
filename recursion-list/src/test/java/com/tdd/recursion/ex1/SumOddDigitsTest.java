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
  void testConversionToDigits_OneDigit() {
    int[] digits = SumOddDigits.getDigits(2);
    assert digits != null;
    assertEquals(2, digits[0]);
    digits = SumOddDigits.getDigits(5);
    assert digits != null;
    assertEquals(5, digits[0]);
  }

  @Test
  void testConversionToDigits() {
    int[] digits = SumOddDigits.getDigits(35);
    assert digits != null;
    assertEquals(5, digits[0]);
    assertEquals(3, digits[1]);
  }
}
