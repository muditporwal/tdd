package org.bank;

class LinkedListMerge {
  private LinkedListMerge() {}

  public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
    if (n1 == null && n2 == null) throw new IllegalStateException("both nodes should not be null");
    else if (n1 == null) return n2;
    else if (n2 == null) return n1;
    else {
      if (n1.val <= n2.val) {
        return getListNode(n1, n2);
      } else {
        return getListNode(n2, n1);
      }
    }
  }

  private static ListNode getListNode(ListNode n1, ListNode n2) {
    ListNode secondListHead = n2.next;
    n2.next = n1.next;
    n1.next = n2;
    mergeTwoLists(n2, secondListHead);
    return n1;
  }
}
