package com.tdd.recursion.limit;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    assertEquals(0L, limit);
  }
}
