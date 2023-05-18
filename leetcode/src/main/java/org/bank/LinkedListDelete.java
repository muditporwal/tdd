package org.bank;

class LinkedListDelete {
  public static ListNode removeElements(ListNode head, int i) {
    if (head == null) return null;
    ListNode newHead = head;
    if(head.val == i) newHead = head.next;
    return newHead;
  }
}
