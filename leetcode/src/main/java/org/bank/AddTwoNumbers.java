package org.bank;

class AddTwoNumbers {
  private AddTwoNumbers() {}

  public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    if (node1 == null) return ListNode.clone(node2);
    if (node2 == null) return ListNode.clone(node1);
    ListNode head = new ListNode(node1.val + node2.val);
    if (node1.next != null || node2.next != null) {
      head.next = addTwoNumbers(node1.next, node2.next);
    }
    return head;
  }
}
