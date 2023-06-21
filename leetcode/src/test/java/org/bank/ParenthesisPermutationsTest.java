package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ParenthesisPermutationsTest {

  @Test
  void testEmptyExpressionShouldReturnEmptyArray() {
    List<Integer> output = ParenthesisPermutations.diffWaysToCompute("");
    assertEquals(0, output.size());
  }
}
