package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void testFibonacci() {
    Fibonacci fib = new Fibonacci();
    int val = fib.fib(0);
    assertEquals(1, val);
    // public int fib(int n)
  }
}
