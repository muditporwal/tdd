package org.bank;

class LinkedListMerge {
  private LinkedListMerge() {}

  public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
    if (n1 == null && n2 == null) return null;
    else if (n1 == null) return n2;
    else if (n2 == null) return n1;
    else {
      if (n1.val > n2.val) {
        n2.next = mergeTwoLists(n1,n2.next);
        return n2;
      } else {
        n1.next = mergeTwoLists(n1.next,n2);
        return n1;
      }
    }
  }
}
