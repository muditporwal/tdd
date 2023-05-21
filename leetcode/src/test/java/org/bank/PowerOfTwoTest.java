package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

  @Test
  void setupTest() {
    Boolean result = PowerOfTwo.isPowerOfTwo(1);
    assertEquals(true, result);
  }
}
