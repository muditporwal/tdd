package org.bank;

class LinkedListMerge {
  public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
    if (n1 == null && n2 == null) throw new IllegalStateException("both nodes should not be null");
    if (n1 == null && n2 != null) return n2;
    if (n2 == null && n1 != null) return n1;
    if (n1 != null && n1.next == null && n2 != null && n2.next == null) {
      if (n1.val <= n2.val) {
        n1.next = n2;
        return n1;
      } else {
        n2.next = n1;
        return n2;
      }
    }
    return null;
  }
}
