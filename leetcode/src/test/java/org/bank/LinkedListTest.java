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
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    LLNode reverseList = list.reverseLList(head);
    assertEquals(head, reverseList.get(0));
    assertEquals(1, reverseList.size());
  }

  @Test
  void testReverseLLWithSecondElementShouldReturnAllElementsInAReverseList() {
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    ListNode node2 = new ListNode(2);
    list.add(node2);
    LLNode reverseList = list.reverseLList(node2);
    assertEquals(2, reverseList.size());
    assertEquals(node2, reverseList.get(0));
  }
}
