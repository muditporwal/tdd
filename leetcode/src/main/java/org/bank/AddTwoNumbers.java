package org.bank;

class AddTwoNumbers {
  private AddTwoNumbers() {}

  public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    return sumWithCarry(node1, node2, 0);
  }

  private static ListNode sumWithCarry(ListNode node1, ListNode node2, int carry) {
    if (node1 == null && node2 == null && carry == 0) {
        return null; // Should be the end case where there is no carry and lists have ended
    } else { // All other cases
      int sum = normalizeVal(node1) + normalizeVal(node2) + carry;
      int carryFwd = sum / 10;
      sum = sum % 10;
      ListNode head = new ListNode(sum);
      head.next = sumWithCarry(getNextNode(node1), getNextNode(node2), carryFwd);
      return head;
    }
  }

  private static ListNode getNextNode(ListNode node1) {
    return (node1 != null) ? node1.next : null;
  }

  private static int normalizeVal(ListNode node) {
    if (node == null) return 0;
    else return node.val;
  }
}
