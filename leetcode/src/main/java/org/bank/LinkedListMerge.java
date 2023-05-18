package org.bank;

class LinkedListMerge {
  private LinkedListMerge() {}

  public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
    if (n1 == null && n2 == null) throw new IllegalStateException("both nodes should not be null");
    else if (n1 == null) return n2;
    else if (n2 == null) return n1;
    else {
      if (n1.val > n2.val) {
        // ListNode newN2 = insertBefore(n1, n2);
        // mergeTwoLists(n2, newN2);
        return n2;
      } else {
        ListNode newN2 = insertAfter(n1, n2);
        mergeTwoLists(n2, newN2);
        return n1;
      }
    }
  }

  private static ListNode insertAfter(ListNode n1, ListNode n2) {
    ListNode returnNode = n2.next;
    n2.next = n1.next;
    n1.next = n2;
    return returnNode;
  }
}
