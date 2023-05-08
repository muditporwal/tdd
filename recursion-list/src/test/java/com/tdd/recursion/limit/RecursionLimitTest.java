package com.tdd.recursion.limit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecursionLimitTest {

  @Test
  void testRecursionLimit() {
    long limit = RecursionLimit.fetchLimit();
    assertEquals(0L, limit);
  }
}
