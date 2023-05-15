package org.bank;

import java.util.ArrayList;
import java.util.List;

class LLNode {
  private final List<ListNode> elements;

  LLNode() {
    this.elements = new ArrayList<>();
  }

  public LLNode(List<ListNode> elements) {
    this.elements = elements;
  }

  public int size() {
    return this.elements.size();
  }

  public LLNode add(ListNode node) {
    if (size() != 0) {
      ListNode lastNode = elements.get(elements.size() - 1);
      lastNode.next = node;
    }
    elements.add(node);
    return new LLNode(elements);
  }

  public LLNode reverseList(ListNode e) {
    return this;
  }

  public ListNode get(int i) {
    return elements.get(i);
  }
}
