package org.bank;

import java.util.ArrayList;
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
    List<MathExpression> right;

    List<MathExpression> left;
    String operator;
    int value;

    public MathExpression(int value) {
      this.value = value;
    }

    public static List<MathExpression> expressionBuilder(String expression) {
      if (expression == null || expression.length() == 0) return Collections.emptyList();
      if (expression.contains("+") || expression.contains("-") || expression.contains("/")) {
        ArrayList<MathExpression> expList = new ArrayList<>();
        for (int i = 0; i < expression.toCharArray().length; i++) {
          if (expression.contains("+") || expression.contains("-") || expression.contains("/")) {
            List<MathExpression> right = expressionBuilder(expression.substring(0, i));
            List<MathExpression> left = expressionBuilder(expression.substring(i + 1));
          }
        }
        return null;

      } else return Collections.singletonList(new MathExpression(Integer.parseInt(expression)));
    }

    private static MathExpression parse(String substring) {
      return null;
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
