package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testSetupLinkedList() {
    LinkedList list = new LinkedList();
    ListNode e = new ListNode(1);
    list.elements.add(e);
    LinkedList reverseList = list.reverseList(e);
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
    LinkedList list = new LinkedList();
    int size = list.size();
    assertEquals(0, size);
  }

  @Test
  void testSingleElementLL() {
    ArrayList<ListNode> ll = new ArrayList<>();
    ll.add(new ListNode(1, null));
    LinkedList list = new LinkedList(ll);
    assertEquals(1, list.size());
  }
}
