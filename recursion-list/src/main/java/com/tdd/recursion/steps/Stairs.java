package com.tdd.recursion.steps;

import java.util.List;

class Stairs {
  private final int width;

  Stairs(int width) {
    this.width = width;
  }

  public List<Integer> traverse() {
      return null;
  }

  static class Builder {
    private int width;

    public Builder width(int width) {
      this.width = width;
      return this;
    }

    public Stairs createStairs() {
      return new Stairs(width);
    }
  }
}
