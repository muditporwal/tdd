package com.tdd.recursion.steps;

class Stairs {
  private final int width;

  Stairs(int width) {
    this.width = width;
  }

  static class Builder {
    private int width;

    public Builder setWidth(int width) {
      this.width = width;
      return this;
    }

    public Stairs createStairs() {
      return new Stairs(width);
    }
  }
}
