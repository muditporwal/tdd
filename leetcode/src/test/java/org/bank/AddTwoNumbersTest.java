package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void testSimpleSingleValueNodeAdditionShouldReturnSum() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode output = AddTwoNumbers.addTwoNumbers(node1, node2);
    assertEquals(output, node3);
  }
}
