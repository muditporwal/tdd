package com.tdd.recursion.ex1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SumOddDigitsTest {

  @Test
  void testInitialization() {
    SumOddDigits sod = new SumOddDigits(0);
    assertNotNull(sod);
    assertEquals(0, sod.getNumber());
  }

  @Test
  void testConversionToDigits_OneDigit() {
    List<Integer> digits = SumOddDigits.getDigits(2);
    assert digits != null;
    assertEquals(2, digits.get(0));
    digits = SumOddDigits.getDigits(5);
    assert digits != null;
    assertEquals(5, digits.get(0));
  }

  @Test
  void testConversionToDigits() {
    List<Integer> digits = SumOddDigits.getDigits(35);
    assert digits != null;
    assertEquals(5, digits.get(0));
    assertEquals(3, digits.get(1));
  }

  @Test
  void testSumOfOddDigits() {
    SumOddDigits sod = new SumOddDigits(2);
    int sum = sod.getSumOfOddDigits();
    assertEquals(2, sum);
    sod = new SumOddDigits(235);
    sum = sod.getSumOfOddDigits();
    assertEquals(7, sum);
  }
}
