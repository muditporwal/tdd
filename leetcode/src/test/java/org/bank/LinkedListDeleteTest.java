package org.bank;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class LinkedListDeleteTest {

  @Test
  void testSetupOfDeleteInterface() {
    // ListNode head = ListNode.build(List.of(1));
    ListNode newHead = LinkedListDelete.removeElements(null, 1);
    assertNull(newHead);
  }
}
