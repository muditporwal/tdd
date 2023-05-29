package org.bank;

class ReorderList {

  private ReorderList() {}

  public static void reorderList(ListNode head) {
    if (head != null && head.next != null) {
      ListNode tail = detachLastNode(head);
      ListNode next = head.next;
      head.next = tail;
      tail.next = next;
      reorderList(next);
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
