package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void fibonacciWithBaseCaseOfZeroShouldReturn1() {
    Fibonacci fib = new Fibonacci();
    int val = fib.fib(0);
    assertEquals(1, val);
    // public int fib(int n)
  }

  @Test
  void fibonacciWithBaseCaseOfOneShouldReturn1() {
    Fibonacci fib = new Fibonacci();
    int val = fib.fib(1);
    assertEquals(1, val);
    // public int fib(int n)
  }
}
