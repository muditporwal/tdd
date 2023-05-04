package com.tdd.recursion.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

  /*Spec :
  The code is a recursive attempt in calculating the result of a factorial function.
  I.e. the result of 3! (Factorial of 3) is 3x2x1 = 6.
  In case of 0! the result is 1 and in case of a negative factorial the result should be 0.
   */

  @Test
  void whenFactorialOf0Return1() {
    int result = Factorial.get(0);
    assertEquals(1, result);
  }

  @Test
  void whenFactorialOf1Return1() {
    int result = Factorial.get(1);
    assertEquals(1, result);
  }
}
