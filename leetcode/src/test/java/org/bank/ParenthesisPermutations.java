package org.bank;

import java.util.Collections;
import java.util.List;

class ParenthesisPermutations {
  public static List<Integer> diffWaysToCompute(String expression) {
    if (expression == null || expression.length() == 0) return Collections.emptyList();
    else if (!expression.contains("*") && !expression.contains("+") && !expression.contains("-"))
      return Collections.singletonList(Integer.valueOf(expression));
    return null;
  }
}
