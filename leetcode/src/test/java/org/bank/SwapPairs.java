package org.bank;

class SwapPairs {
  private SwapPairs() {}

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode second = head.next;
    head.next = swapPairs(second.next);
    second.next = head;
    return second;
  }
}
