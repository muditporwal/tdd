package com.tdd.recursion.limit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionLimitTest {
  private RecursionLimit rl;

  @BeforeEach
  void setup() {
    rl = new RecursionLimit();
    rl.setLimit(12);
  }

  @Test
  void testRecursionLimit() {
    long limit = rl.fetchLimit();
    assertEquals(12L, limit);
  }

  @Test
  void testExecutionLimitExceedingForRecursion() {
    long limit = rl.fetchLimit();
    long executionRange = limit + 1;
    assertThrowsExactly(RuntimeException.class, () -> rl.testLimit(executionRange));
  }

  @Test
  void testExecutionLimitInRangeForRecursion() {
    long limit = rl.fetchLimit();
    long executionRange = limit;
    assertEquals(executionRange, rl.testLimit(executionRange));
  }

  @Test
  void testStackOverflowWithLargeLimit() {
    rl.setLimit(3500L);
    long limit = rl.fetchLimit();
    long executionRange = limit;
    assertEquals(executionRange, rl.testLimit(executionRange));
  }
}
