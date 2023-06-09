package com.tdd.recursion.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tdd.recursion.MathMax;
import org.junit.jupiter.api.Test;

class TestMathMax {

  @Test
  void singleElementListShouldReturnTheDigit() {
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

  @Test
  void twoElementListShouldReturnTheMax() {
    int[] a = new int[] {2, 1};
    int b = MathMax.apply(null, a);
    assertEquals(2, b);
  }

  @Test
  void threeElementListShouldReturnTheMax() {
    int[] a = new int[] {2, 3, 4, 5, 2, 1, -1, 0};
    int b = MathMax.apply(null, a);
    assertEquals(5, b);
  }
}
