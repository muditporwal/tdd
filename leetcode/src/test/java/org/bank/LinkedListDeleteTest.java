package org.bank;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class LinkedListDeleteTest {

  @Test
  void deletionFromAnEmptyListShouldReturnAnEmptyList() {
    // ListNode head = ListNode.build(List.of(1));
    ListNode newHead = LinkedListDelete.removeElements(null, 1);
    assertNull(newHead);
  }

  @Test
  void deletionFromAnSingleElementListShouldReturnAnEmptyList() {
    ListNode head = ListNode.build(List.of(1));
    ListNode newHead = LinkedListDelete.removeElements(head, 1);
    assertNull(newHead);
  }
}
