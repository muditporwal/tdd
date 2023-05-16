package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {

  private Fibonacci fib;

  @BeforeEach
  void setup() {
    fib = new Fibonacci();
  }

  @Test
  void fibonacciWithBaseCaseOfZeroShouldReturn1() {
    int val = fib.fib(0);
    assertEquals(0, val);
  }

  @Test
  void fibonacciWithBaseCaseOfOneShouldReturn1() {
    int val = fib.fib(1);
    assertEquals(1, val);
  }

  @Test
  void fibonacciWithHigherOrderIntegerShouldReturnSumOfPreviousFibs() {
    int val = fib.fib(2);
    assertEquals(2, val);
  }
}
