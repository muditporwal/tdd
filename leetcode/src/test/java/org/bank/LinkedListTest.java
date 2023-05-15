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
  void testReverseLLWithOneElement() {
    ListNode head = new ListNode(1);
    LLNode list = new LLNode(head);
    LLNode reverseList = list.reverseList(head);
    assertEquals(list, reverseList);
  }

  //  @Test
  //  void testReverseLLWithTwoElement() {
  //    LLNode list = new LLNode();
  //    ListNode node1 = new ListNode(1);
  //    ListNode node2 = new ListNode(2);
  //    list.add(node1);
  //    list.add(node2);
  //    LLNode reverseList = list.reverseList(node1);
  //    assertEquals(1, reverseList.size());
  //    assertEquals(node1, reverseList.get(0));
  //
  //    reverseList = list.reverseList(node2);
  //    assertEquals(2, reverseList.size());
  //    assertEquals(node2, reverseList.get(0));
  //    assertEquals(node1, reverseList.get(1));
  //    assertEquals(node2.next, node1);
  //  }
}
