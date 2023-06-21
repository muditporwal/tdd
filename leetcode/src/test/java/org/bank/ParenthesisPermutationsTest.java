package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParenthesisPermutationsTest {

  @Test
  void testEmptyExpressionShouldReturnEmptyArray() {
    int[] output = ParenthesisPermutations.diffWaysToCompute("");
    assertEquals(0, output.length);
  }
}
