package com.tdd.recursion.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tdd.recursion.MathMax;
import org.junit.jupiter.api.Test;

class TestMathMax {

  @Test
  void singleDigitListShouldReturnTheDigit() {
    int[] a = new int[] {1};
    int b = MathMax.apply(null, a);
    assertEquals(1, b);
  }

  @Test
  void noElementListShouldReturnMinimumInteger() {
    int[] a = new int[] {};
    int b = MathMax.apply(null, a);
    assertEquals(Integer.MIN_VALUE, b);
  }
}
