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

  @Test
  void positivePowerShouldProduceCorrectResult() {
    double result = PowerTo.myPow(2.0, 1);
    assertEquals(2.0, result);
    result = PowerTo.myPow(2.0, 2);
    assertEquals(4.0, result);
  }

  @Test
  void negativePowerShouldProduceCorrectResult() {
    double result = PowerTo.myPow(2.0, -1);
    assertEquals(0.5, result);
    result = PowerTo.myPow(2.0, -2);
    assertEquals(0.25, result);
  }

  @Test
  void testScenarioFromCase() {
    double result = PowerTo.myPow(2.10, 3);
    assertEquals(9.261, result, 0.000001);
  }
}
