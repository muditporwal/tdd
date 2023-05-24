package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SwapPairsTest {

  @Test
  void testSwapWithOneNode() {
    ListNode head = new ListNode(1);
    ListNode out = SwapPairs.swapPairs(head);
    assertEquals(head, out);
  }
}
