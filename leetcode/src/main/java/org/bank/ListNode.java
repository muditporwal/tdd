package org.bank;

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

  public static ListNode build(List<Integer> values) {}

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
}
