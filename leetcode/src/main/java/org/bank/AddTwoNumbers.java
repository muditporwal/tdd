package org.bank;

class AddTwoNumbers {
  private AddTwoNumbers() {}

  public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    return sumWithCarry(node1, node2, 0);
  }

  private static ListNode sumWithCarry(ListNode node1, ListNode node2, int carry) {
    if (node1 == null && carry == 0) return ListNode.clone(node2);
    if (node2 == null && carry == 0) return ListNode.clone(node1);
    int sum = normalizeVal(node1) + normalizeVal(node2) + carry;
    int carryFwd = sum / 10;
    sum = sum % 10;
    ListNode head = new ListNode(sum);
    if (node1.next != null || node2.next != null) {
      head.next = sumWithCarry(node1.next, node2.next, carryFwd);
    }
    return head;
  }

  private static int normalizeVal(ListNode node) {
    if (node == null) return 0;
    else return node.val;
  }
}
