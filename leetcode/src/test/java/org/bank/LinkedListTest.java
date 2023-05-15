package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testEmptyLL() {
    LLNode list = new LLNode();
    int size = list.size();
    assertEquals(0, size);
  }

  @Test
  void testSingleElementLL() {
    LLNode list = new LLNode();
    list.add(new ListNode(1));
    assertEquals(1, list.size());
  }

  @Test
  void testTwoElementLL() {
    LLNode list = new LLNode();
    list.add(new ListNode(1));
    list.add(new ListNode(2));
    assertEquals(2, list.size());
    assertNotNull(list.get(0).next);
  }

  @Test
  void testReverseLLWithOneElement() {
    LLNode list = new LLNode();
    ListNode node = new ListNode(1);
    list.add(node);
    LLNode reverseList = list.reverseList(node);
    assertEquals(list, reverseList);
  }

  @Test
  void testReverseLLWithTwoElement() {
    LLNode list = new LLNode();
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    list.add(node1);
    list.add(node2);
    LLNode reverseList = list.reverseList(node1);
    assertEquals(1, reverseList.size());
    assertEquals(node1, reverseList.get(0));

    reverseList = list.reverseList(node2);
    assertEquals(2, reverseList.size());
    assertEquals(node2, reverseList.get(0));
    assertEquals(node1, reverseList.get(1));
    assertEquals(node2.next, node1);
  }
}
