package org.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ListNode {
  ListNode next;
  int val;

  ListNode(int val) {
    this.val = val;
    next = null;
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

  public static ListNode clone(ListNode node) {
    if (node == null) return null;
    ListNode head = new ListNode(node.val);
    ListNode current = node;
    ListNode currentNew = head;
    while (current.next != null) {
      currentNew.next = new ListNode(current.next.val);
      currentNew = currentNew.next;
      current = current.next;
    }
    return head;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, val);
  }
}
