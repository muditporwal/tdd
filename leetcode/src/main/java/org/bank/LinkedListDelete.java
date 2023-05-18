package org.bank;

class LinkedListDelete {
  public static ListNode removeElements(ListNode head, int i) {
    if (head == null) return null;
    ListNode newHead = head;
    if (head.val == i) {
      newHead = removeElements(head.next, i);
    } else {
      return null;
    }
    return newHead;
  }
}
