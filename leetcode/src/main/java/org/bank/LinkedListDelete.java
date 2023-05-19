package org.bank;

class LinkedListDelete {
  public static ListNode removeElements(ListNode head, int i) {
    if (head == null) return null;
    ListNode newHead;
    if (head.val == i) {
      newHead = removeElements(head.next, i);
    } else {
      head.next = removeElements(head.next, i);
      newHead = head;
    }
    return newHead;
  }
}
