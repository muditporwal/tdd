package com.tdd.recursion.steps;

import java.util.Collections;
import java.util.List;

class Stairs {

  Stairs() {}

  public static List<Integer> traverse(int startStair, int strideWidth) {
    if (startStair < 0 || startStair > 99)
      throw new IllegalArgumentException("Starting stair should be within range 1 to 100");
    if (strideWidth == 0) return Collections.emptyList();
    return null;
  }
}
