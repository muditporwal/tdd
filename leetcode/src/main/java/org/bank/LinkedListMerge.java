package org.bank;

class LinkedListMerge {
  public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
    if (n1 == null && n2 == null) throw new IllegalStateException("both nodes should not be null");
    if (n1 == null && n2 != null) return n2;
    if (n2 == null && n1 != null) return n1;
    return null;
  }
}
