package com.tdd.recursion.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.util.List;
import org.junit.jupiter.api.Test;

class TestStairs {

  @Test
  void testWidth0ShouldReturnEmptyArray() {
    int startStair = 20;
    List<Integer> steps = Stairs.traverse(startStair, 0);
    assertEquals(0, steps.size());
  }

  @Test
  void testWidth1WithStart1ShouldReturnArrayWith1Elements() {
    List<Integer> steps = Stairs.traverse(1, 1);
    assertEquals(2, steps.size());
  }

  @Test
  void testWidth1WithStart20ShouldReturnArrayWith21Elements() {
    List<Integer> steps = Stairs.traverse(20, 1);
    assertEquals(21, steps.size());
  }

  @Test
  void testForInvalidStartStairs() {
    assertThrowsExactly(IllegalArgumentException.class, () -> Stairs.traverse(-1, 3));
    assertThrowsExactly(IllegalArgumentException.class, () -> Stairs.traverse(200, 3));
  }

  @Test
  void testForInvalidStrideWidth() {
    assertThrowsExactly(IllegalArgumentException.class, () -> Stairs.traverse(50, 60));
  }
}
