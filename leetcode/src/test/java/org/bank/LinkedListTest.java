package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSetupLinkedList() {
    LLNode list = new LLNode();
    ListNode e = new ListNode(1);
    list.elements.add(e);
    LLNode reverseList = list.reverseList(e);
    assertEquals(reverseList.elements.get(0), e);
    ListNode f = new ListNode(2);
    e.next = f;
    list.elements.add(f);
    reverseList = list.reverseList(e);
    assertEquals(reverseList.elements.get(0), f);
    assertEquals(reverseList.elements.get(1), e);
  }

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
}
