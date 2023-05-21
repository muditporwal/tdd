package org.bank;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  void testForEvenValues() {
    assertEquals(false, PowerOfTwo.isPowerOfTwo(6));
    assertEquals(true, PowerOfTwo.isPowerOfTwo(8));
  }

  @Test
  void testForEdgeCasesOf2Pow30() {
    int pow30 = (int) Math.pow(2, 30);
    assertTrue(pow30 > 0);
    assertEquals(true, PowerOfTwo.isPowerOfTwo(pow30));
    int pow31minus1 = (int) (Math.pow(2, 31)) - 1;
    assertTrue(pow31minus1 > 0);
    assertEquals(false, PowerOfTwo.isPowerOfTwo(pow31minus1));
  }
}
