package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SwapPairsTest {

  @Test
  void testSwapWithOneNode() {
    ListNode head = new ListNode(1);
    ListNode out = SwapPairs.swapPairs(head);
    assertEquals(head, out);
  }

  @Test
  void testSwapWithTwoNode() {
    ListNode head = ListNode.build(List.of(1, 2));
    ListNode expected = ListNode.build(List.of(2, 1));
    ListNode out = SwapPairs.swapPairs(head);
    assertEquals(expected, out);
  }

  @Test
  void testSwapWithThreeNode() {
    ListNode head = ListNode.build(List.of(1, 2, 3));
    ListNode expected = ListNode.build(List.of(2, 1, 3));
    ListNode out = SwapPairs.swapPairs(head);
    assertEquals(expected, out);
  }

  @Test
  void testSwapWithFourNode() {
    ListNode head = ListNode.build(List.of(1, 2, 3, 4));
    ListNode expected = ListNode.build(List.of(2, 1, 4, 3));
    ListNode out = SwapPairs.swapPairs(head);
    assertEquals(expected, out);
  }
}
