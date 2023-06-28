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
  void testMathExpressionInitializationWithNumberAlone() {
    ParenthesisPermutations.MathExpression me = new ParenthesisPermutations.MathExpression(1);
    assertEquals(1, me.getValue());
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
    assertEquals(1, output.size());
    assertEquals(12, output.get(0));
  }

  @Test
  void testSubstring() {
    String expression = "113+2*41+1";
    for (int i = 0; i < expression.toCharArray().length; i++) {
      if ('*' == expression.charAt(i)) {
        System.out.println(expression.substring(i + 1));
        System.out.println(expression.substring(0, i));
        System.out.println(expression.substring(i, i));
      }
    }
  }
}
