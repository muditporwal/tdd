package org.bank;

class ReorderList {

  private ReorderList() {}

  public static void reorderList(ListNode head) {
    if (head == null || head.next == null) {
    } else {
      ListNode current = head;
      ListNode tail = detachLastNode(current);
      ListNode next = current.next;
      current.next = tail;
      tail.next = next;
    }
  }

  private static ListNode detachLastNode(ListNode current) {
    if (current.next.next == null) {
      ListNode detach = current.next;
      current.next = null;
      return detach;
    } else {
      return detachLastNode(current.next);
    }
  }
}
