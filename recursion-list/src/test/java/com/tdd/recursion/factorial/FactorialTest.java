package com.tdd.recursion.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class FactorialTest {

  /*Spec :
  The code is a recursive attempt in calculating the result of a factorial function.
  I.e. the result of 3! (Factorial of 3) is 3x2x1 = 6.
  In case of 0! the result is 1 and in case of a negative factorial the result should be 0.
   */

  @Test
  void whenNumberIsABigNumber() {
    assertEquals(109641728, Factorial.compute(19));
    // Optimize takes 23 ms
  }

  @Test
  void whenFactorialOf0Return1() {
    int result = Factorial.compute(0);
    assertEquals(1, result);
  }

  @Test
  void whenFactorialOf1Return1() {
    int result = Factorial.compute(1);
    assertEquals(1, result);
  }

  @Test
  void whenFactorialOfANegativeNumberIsRequestedThrowException() {
    assertThrowsExactly(IllegalArgumentException.class, () -> Factorial.compute(-1));
  }

  @Test
  void whenNumberIsAPositiveInteger() {
    assertEquals(2, Factorial.compute(2));
    assertEquals(6, Factorial.compute(3));
  }
}
