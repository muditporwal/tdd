package org.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfThreeTest {

  @Test
  void testForEdgeCaseOfOne() {
    Boolean result = PowerOfThree.isPowerOfThree(1);
    assertEquals(true, result);
  }

  @Test
  void testForEdgeCaseOfZeroAndNegative() {
    assertThrowsExactly(IllegalArgumentException.class, () -> PowerOfThree.isPowerOfThree(-1));
    assertThrowsExactly(IllegalArgumentException.class, () -> PowerOfThree.isPowerOfThree(0));
  }

  @Test
  void testForNonMultipleValues() {
    assertFalse(PowerOfThree.isPowerOfThree(2));
    assertFalse(PowerOfThree.isPowerOfThree(10));
  }

  @Test
  void testForMultipleValues() {
    assertFalse(PowerOfThree.isPowerOfThree(6));
    assertTrue(PowerOfThree.isPowerOfThree(9));
  }

  @Test
  void testForEdgeCasesOf2Pow30() {
    int pow30 = (int) Math.pow(2, 30);
    assertTrue(pow30 > 0);
    assertFalse(PowerOfThree.isPowerOfThree(pow30));
    int pow31minus1 = (int) (Math.pow(2, 31)) - 1;
    assertTrue(pow31minus1 > 0);
    assertFalse(PowerOfThree.isPowerOfThree(pow31minus1));
  }
}
