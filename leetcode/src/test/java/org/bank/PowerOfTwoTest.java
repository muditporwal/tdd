package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

  @Test
  void testForEdgeCaseOfOne() {
    Boolean result = PowerOfTwo.isPowerOfTwo(1);
    assertEquals(true, result);
  }

  @Test
  void testForEdgeCaseOfZeroAndNegative() {
    assertThrowsExactly(IllegalArgumentException.class, () -> PowerOfTwo.isPowerOfTwo(-1));
    assertThrowsExactly(IllegalArgumentException.class, () -> PowerOfTwo.isPowerOfTwo(0));
  }


  @Test
  void testForOddValues() {
    assertEquals(false, PowerOfTwo.isPowerOfTwo(3));
    assertEquals(false, PowerOfTwo.isPowerOfTwo(11));
  }
}
