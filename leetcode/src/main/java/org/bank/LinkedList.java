package org.bank;

import java.util.ArrayList;
import java.util.List;

class LinkedList {
  List<ListNode> elements;

  LinkedList() {
    this.elements = new ArrayList<>();
  }

  LinkedList(List<ListNode> elements) {
    this.elements = elements;
  }

  public LinkedList reverseList(ListNode e) {
    List<ListNode> list = new ArrayList<>();
    list.add(e);
    return new LinkedList(list);
  }

  public int size() {
    return this.elements.size();
  }
}
