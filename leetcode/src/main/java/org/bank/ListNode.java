package org.bank;

import java.util.ArrayList;
import java.util.List;

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode build(List<Integer> values) {
    ListNode outputNode = null;
    ListNode previousNode = null;
    ListNode currentNode;
    if (values == null) {
      return null;
    }
    for (int i = 0; i < values.size(); i++) {
      if (values.get(i) == null) throw new IllegalArgumentException("Invalid Integer Value");
      currentNode = new ListNode(values.get(i));
      if (i == 0) {
        outputNode = currentNode;
        previousNode = currentNode;
        continue;
      }
      previousNode.next = currentNode;
      previousNode = currentNode;
    }
    return outputNode;
  }

  public static ListNode reverseList(ListNode node) {
    if (node == null || node.next == null) {
      return node;
    } else {
      ListNode head = reverseList(node.next);
      ListNode traversalNode = head;
      while (traversalNode.next != null) {
        traversalNode = traversalNode.next;
      }
      traversalNode.next = node;
      node.next = null;
      return head;
    }
  }

  public int size() {
    ListNode node = this;
    int size = 0;
    while (node != null) {
      size++;
      node = node.next;
    }
    return size;
  }

  public List<Integer> toList() {
    ArrayList<Integer> list = new ArrayList<>();
    ListNode element = this;
    while (element != null) {
      list.add(element.val);
      element = element.next;
    }
    return list;
  }
}
