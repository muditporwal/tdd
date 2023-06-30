package org.bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ParenthesisCombination {
  private String expression;

  public ParenthesisCombination() {
    /* TODO document why this constructor is empty */
  }

  public List<Integer> diffWaysToCompute(String expression) {
    setExpression(expression);
    return null;
  }

  private void setExpression(String expression) {
    this.expression = expression;
  }

  interface Expression {
    Integer evaluate();
  }

  static class Num implements Expression {

    int value;

    public Num(int value) {
      this.value = value;
    }

    @Override
    public Integer evaluate() {
      return this.value;
    }
  }

  static class Operator implements Expression {

    private final Expression left;
    private final Expression right;
    private final String op;

    public Operator(Expression left, String op, Expression right) {
      this.left = left;
      this.right = right;
      this.op = op;
    }

    @Override
    public Integer evaluate() {
      return switch (this.op) {
        case "+" -> left.evaluate() + right.evaluate();
        case "-" -> left.evaluate() - right.evaluate();
        case "*" -> left.evaluate() * right.evaluate();
        default -> throw new IllegalStateException("Unexpected value: " + this.op);
      };
    }
  }

  public static class BracketParser {
    public static List<Expression> parse(String expression) {
      if (expression == null || expression.isEmpty()) return Collections.emptyList();
      if (expression.contains("+") || expression.contains("-") || expression.contains("*")) {
        char[] charArray = expression.toCharArray();
        ArrayList<Expression> expressions = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
          char c = charArray[i];
          if (c == '+' || c == '-' || c == '*') {
            String left = getLeftSubstring(expression, i);
            String right = getRightSubstring(expression, i);
            String op = String.valueOf(c);
            List<Expression> leftExps = parse(left);
            List<Expression> rightExps = parse(right);
            List<Operator> list =
                leftExps.stream()
                    .map(
                        lexp ->
                            rightExps.stream().map(rexp -> new Operator(lexp, op, rexp)).toList())
                    .flatMap(Collection::stream)
                    .toList();
            expressions.addAll(list);
          }
        }
        return expressions;
      } else {
        return Collections.singletonList(new Num(Integer.parseInt(expression)));
      }
    }

    static String getRightSubstring(String expression, int i) {
      return expression.substring(i + 1);
    }

    static String getLeftSubstring(String expression, int i) {
      return expression.substring(0, i);
    }
  }
}
