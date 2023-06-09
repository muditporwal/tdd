package com.tdd.recursion.steps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stairs {

  public static final int MAX_STAIRS = 100;
  public static final int MIN_STAIRS = 0;

  Stairs() {}

  public static List<Integer> traverse(int startStair, int strideWidth) {
    if (startStair < MIN_STAIRS || startStair > MAX_STAIRS)
      throw new IllegalArgumentException("Starting stair should be within range 1 to 100");
    if (strideWidth > MAX_STAIRS - startStair)
      throw new IllegalArgumentException("Stride width is too big, will land in lava");
    if (strideWidth == 0) return Collections.emptyList();
    List<Integer> acc = new ArrayList<>();
    return traverse(acc, startStair, strideWidth);
  }

  private static List<Integer> traverse(List<Integer> acc, int startStair, int strideWidth) {
    acc.add(startStair);
    int nextStartStair = startStair - strideWidth;
    if (nextStartStair < MIN_STAIRS) return acc;
    else return traverse(acc, nextStartStair, strideWidth);
  }
}
