package org.bank;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class ParenthesisPermutations {
  public static List<Integer> diffWaysToCompute(String expression) {
    List<MathExpression> mathExpressions = MathExpression.expressionBuilder(expression);
    return Objects.requireNonNull(mathExpressions).stream()
        .map(MathExpression::evaluate)
        .collect(Collectors.toList());
  }

  static class MathExpression {
    MathExpression right;

    MathExpression left;
    String operator;

    public static List<MathExpression> expressionBuilder(String expression) {
      // TODO
      return null;
    }

    public Integer evaluate() {
      // TODO
      return null;
    }
  }
}
