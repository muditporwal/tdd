package org.bank;

class SwapPairs {
  private SwapPairs() {}

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode headNext = head.next;
    head.next = head.next.next;
    headNext.next = head;
    return headNext;
  }
}
