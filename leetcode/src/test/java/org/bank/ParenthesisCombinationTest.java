package org.bank;

import java.util.List;
import org.junit.jupiter.api.Test;

class ParenthesisCombinationTest {
  @Test
  void createInterface() {
    ParenthesisCombination pc = new ParenthesisCombination();
    List<Integer> outcomes = pc.diffWaysToCompute("");
  }

  private class ParenthesisCombination {
    public ParenthesisCombination() {}

    public List<Integer> diffWaysToCompute(String s) {
      return null;
    }
  }
}
