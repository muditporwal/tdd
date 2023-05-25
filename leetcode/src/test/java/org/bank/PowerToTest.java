package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PowerToTest {

  @Test
  void testPowOfZero() {
    double result = PowerTo.myPow(1.0, 0);
    assertEquals(1.0, result);
  }

  @Test
  void testZeroPowersShouldReturnZero() {
    double result = PowerTo.myPow(0.0, 1);
    assertEquals(0.0, result);
  }
}
