package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSetupLinkedList() {
    LinkedList list = new LinkedList();
    ListNode e = new ListNode(1);
    list.elements.add(e);
    assertEquals(list.elements, list.reverseList(e));
  }
}
