package org.bank;

class AddTwoNumbers {
    private AddTwoNumbers() {
    }

    public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    return new ListNode(node1.val + node2.val);
  }
}
