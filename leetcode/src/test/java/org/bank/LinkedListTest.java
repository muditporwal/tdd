package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSingleElementLLShouldReturnSize1() {
    ListNode head = new ListNode(1);
    assertEquals(1, head.size());
  }

  @Test
  void testTwoElementLL() {
    ListNode node = new ListNode(2);
    ListNode head = new ListNode(1, node);
    assertEquals(2, head.size());
    assertNotNull(head.next);
    assertEquals(node, head.next);
  }

  @Test
  void testReverseLLWithOneElementShouldReturnTheSameElementAsHead() {
    ListNode node = new ListNode(1);
    assertEquals(node, ListNode.reverse(node));
  }

  // @Test
  void testReverseLLWithSecondElementShouldReturnAllElementsInAReverseList() {
    ListNode node = new ListNode(2);
    ListNode head = new ListNode(1, node);
    ListNode newHead = ListNode.reverse(head);
    assertEquals(2, newHead.size());
    assertEquals(node, newHead);
  }
}
