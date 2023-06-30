package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParenthesisCombinationTest {
  @Test
  void createInterface() {
    ParenthesisCombination pc = new ParenthesisCombination();
    List<Integer> outcomes = pc.diffWaysToCompute("");
  }

  //  TODO
  //   1. Find out Tree DataStructure for Java - Need to implement what you need
  //   2. Figure out how to parse string into `left operator right`
  //   3. CreateOutline for computation
  //   4. Identify output format for parsing
  //   5. WriteTest Functions for parsing
  //   6. Indentify ouput format for evaluation of parsed value
  //   7. Algorithm for evaluation

  @Test
  void creatingNumberExpression() {
    ParenthesisCombination.Number number = new ParenthesisCombination.Number(12);
    assertEquals(12, number.evaluate());
  }

  @Test
  void createSimpleOperatorExpression() {
    ParenthesisCombination.Number one = new ParenthesisCombination.Number(1);
    ParenthesisCombination.Number two = new ParenthesisCombination.Number(2);
    ParenthesisCombination.Operator plus = new ParenthesisCombination.Operator(one, "+", two);
    ParenthesisCombination.Operator minus = new ParenthesisCombination.Operator(two, "-", one);
    ParenthesisCombination.Operator multiply = new ParenthesisCombination.Operator(two, "*", one);
    Assertions.assertEquals(3, plus.evaluate());
    Assertions.assertEquals(1, minus.evaluate());
    Assertions.assertEquals(2, multiply.evaluate());
  }

  @Test
  void createNestedOperatorExpression() {
    ParenthesisCombination.Number one = new ParenthesisCombination.Number(1);
    ParenthesisCombination.Number two = new ParenthesisCombination.Number(2);
    ParenthesisCombination.Operator plus = new ParenthesisCombination.Operator(one, "+", two);
    ParenthesisCombination.Operator multiply = new ParenthesisCombination.Operator(two, "*", one);
    ParenthesisCombination.Operator nestedPlus =
        new ParenthesisCombination.Operator(plus, "+", multiply);
    Assertions.assertEquals(3, plus.evaluate());
    Assertions.assertEquals(2, multiply.evaluate());
    Assertions.assertEquals(5, nestedPlus.evaluate());
  }
}
