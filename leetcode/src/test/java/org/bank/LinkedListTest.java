package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSingleElementLLShouldReturnSize1() {
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    assertEquals(1, list.size());
    assertEquals(head, list.get(0));
  }

  @Test
  void testTwoElementLL() {
    LLNode list = new LLNode(new ListNode(1));
    ListNode node = new ListNode(2);
    list.add(node);
    assertEquals(2, list.size());
    assertNotNull(list.get(0).next);
    assertEquals(node, list.get(0).next);
    assertEquals(node, list.get(1));
  }

  @Test
  void testReverseLLWithOneElementShouldReturnTheSameElementAsHead() {
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    LLNode reverseList = list.reverseList(head);
    assertEquals(head, reverseList.get(0));
    assertEquals(1, reverseList.size());
  }

  @Test
  void testReverseLLWithSecondElementShouldReturnAllElementsInAReverseList() {
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    ListNode node2 = new ListNode(2);
    list.add(node2);
    LLNode reverseList = list.reverseList(head);
    assertEquals(1, reverseList.size());
    assertEquals(head, reverseList.get(0));
  }
}
