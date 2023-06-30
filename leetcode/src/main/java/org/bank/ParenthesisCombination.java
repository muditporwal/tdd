package org.bank;

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

  private interface Expression {
    Integer evaluate();
  }

  static class Number implements Expression {

    int value;

    public Number(int value) {
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
}
