package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSetupLinkedList() {
    LinkedList list = new LinkedList();
    ListNode e = new ListNode(1);
    list.elements.add(e);
    List<ListNode> reverseList = list.reverseList(e);
    assertEquals(reverseList.get(0), e);
    ListNode f = new ListNode(2);
    e.next = f;
    list.elements.add(f);
    reverseList = list.reverseList(e);
    assertEquals(reverseList.get(0), f);
    assertEquals(reverseList.get(1), e);
  }
}
