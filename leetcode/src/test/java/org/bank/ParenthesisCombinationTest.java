package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ParenthesisCombinationTest {
  @Test
  void createInterface() {
    ParenthesisCombination pc = new ParenthesisCombination();
    List<Integer> outcomes = pc.diffWaysToCompute("");
  }

  //  TODO
  //   1. Find out Tree DataStructure for Java - Need to implement what you need
  // How can one force someone to implement a DS
  //   2. Figure out how to parse string into `left operator right`
  //   3. CreateOutline for computation
  //   4. Identify output format for parsing
  //   5. WriteTest Functions for parsing
  //   6. Indentify ouput format for evaluation of parsed value
  //   7. Algorithm for evaluation

  @Test
  void creatingNumberExpressio() {
    ParenthesisCombination.Number number = new ParenthesisCombination.Number(12);
    assertEquals(12, number.evaluate());
  }
}
