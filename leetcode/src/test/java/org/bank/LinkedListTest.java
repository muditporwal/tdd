package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSingleElementLLShouldReturnSize1() {
    LLNode list = new LLNode(new ListNode(1));
    assertEquals(1, list.size());
  }

  //  @Test
  //  void testTwoElementLL() {
  //    LLNode list = new LLNode(new ListNode(1));
  //    list.add(new ListNode(2));
  //    assertEquals(2, list.size());
  //    assertNotNull(list.get(0).next);
  //  }
  //
  //  @Test
  //  void testReverseLLWithOneElement() {
  //    ListNode head = new ListNode(1);
  //    LLNode list = new LLNode(head);
  //    LLNode reverseList = list.reverseList(head);
  //    assertEquals(list, reverseList);
  //  }
  //
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
