package org.bank;

import java.util.Collections;
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
    int value;

    public MathExpression(int value) {
      this.value = value;
    }

    public static List<MathExpression> expressionBuilder(String expression) {
      if (expression == null || expression.length() == 0) return Collections.emptyList();
      if (expression.contains("+") || expression.contains("-") || expression.contains("/")) {
        return null;
        // TODO see how to return multiple expressions
      } else return Collections.singletonList(new MathExpression(Integer.parseInt(expression)));
    }

    public Integer evaluate() {
      if (operator == null) return value;
      else
        return switch (operator) {
          case "+" -> right.evaluate() + left.evaluate();
          case "-" -> right.evaluate() - left.evaluate();
          case "*" -> right.evaluate() * left.evaluate();
          default -> throw new IllegalStateException("Invalid operator");
        };
    }

    public int getValue() {
      return value;
    }
  }
}
