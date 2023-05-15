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
}
