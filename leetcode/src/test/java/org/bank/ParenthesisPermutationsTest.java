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

  @Test
  void testSingleDigitExpressionShouldReturnTheDigit() {
    List<Integer> output = ParenthesisPermutations.diffWaysToCompute("3");
    assertEquals(1, output.size());
    assertEquals(3, output.get(0));
  }

  @Test
  void testSingleExpressionShouldReturnOneEvaluation() {
    List<Integer> output = ParenthesisPermutations.diffWaysToCompute("3*4");
  }
}
