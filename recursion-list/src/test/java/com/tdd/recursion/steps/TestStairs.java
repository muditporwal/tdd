package com.tdd.recursion.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TestStairs {

  @Test
  void testWidth0ShouldReturnEmptyArray() {
    Stairs stairs = new Stairs.Builder().width(0).createStairs();
    List<Integer> steps = stairs.traverse();
    assertEquals(0, steps.size());
  }
}
