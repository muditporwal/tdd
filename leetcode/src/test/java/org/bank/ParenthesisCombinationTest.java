package org.bank;

import static org.bank.ParenthesisCombination.*;
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
    Num number = new Num(12);
    assertEquals(12, number.evaluate());
  }

  @Test
  void createSimpleOperatorExpression() {
    Num one = new Num(1);
    Num two = new Num(2);
    Operator plus = new Operator(one, "+", two);
    Operator minus = new Operator(two, "-", one);
    Operator multiply = new Operator(two, "*", one);
    Assertions.assertEquals(3, plus.evaluate());
    Assertions.assertEquals(1, minus.evaluate());
    Assertions.assertEquals(2, multiply.evaluate());
  }

  @Test
  void createNestedOperatorExpression() {
    Num one = new Num(1);
    Num two = new Num(2);
    Operator plus = new Operator(one, "+", two);
    Operator multiply = new Operator(two, "*", one);
    Operator nestedPlus = new Operator(plus, "+", multiply);
    Assertions.assertEquals(3, plus.evaluate());
    Assertions.assertEquals(2, multiply.evaluate());
    Assertions.assertEquals(5, nestedPlus.evaluate());
  }

  @Test
  void givenStringExpressionConvertToListOfOperatorExpressions() {}

  @Test
  void givenEmptyStringShouldReturnEmptyListOfOperatorExpression() {
    String expression = "";
    BracketParser bp = new BracketParser(expression);
    List<Expression> exps = bp.parse();
    Assertions.assertNotNull(exps);
    Assertions.assertEquals(0, exps.size());
  }
}
