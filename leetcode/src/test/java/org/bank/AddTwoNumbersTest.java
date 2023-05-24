package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void testNoCarrySingleValueNodeAdditionShouldReturnSum() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode output = AddTwoNumbers.addTwoNumbers(node1, node2);
    assertEquals(output, node3);
  }

  @Test
  void testNoCarryMultiNodeAdditionShouldReturnSum() {
    ListNode node1 = ListNode.build(List.of(1, 2, 1));
    ListNode node2 = ListNode.build(List.of(3, 2, 1));
    ListNode node3 = ListNode.build(List.of(4, 4, 2));
    ListNode output = AddTwoNumbers.addTwoNumbers(node1, node2);
    assertEquals(output, node3);
  }
}
