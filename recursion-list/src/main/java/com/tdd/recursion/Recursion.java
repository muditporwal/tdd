package com.tdd.recursion;

import java.util.List;

class Recursion {
  private Recursion() {}

  public static List<String> reverse(List<String> low) {
    if (low.size() <= 1) return low;
    else {
      String head = low.get(0);
      List<String> tail = low.subList(1, low.size());
      reverse(tail).add(head);
      return tail;
    }
  }
}
