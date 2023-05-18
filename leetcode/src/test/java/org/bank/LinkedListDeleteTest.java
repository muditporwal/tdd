package org.bank;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  void deletionFromATwoElementListShouldRemoveAllElementsWithValueAndReturn() {
    ListNode head = ListNode.build(List.of(1, 1));
    ListNode newHead = LinkedListDelete.removeElements(head, 1);
    assertNull(newHead);
  }

  @Test
  void deletionFromATwoElementListShouldRemoveTheElementsWithValueAndReturn() {
    ListNode head = ListNode.build(List.of(1, 2, 1));
    ListNode newHead = LinkedListDelete.removeElements(head, 1);
    assertNotNull(newHead);
    assertEquals(new ListNode(2), newHead);
  }
}
