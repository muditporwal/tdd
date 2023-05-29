package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReorderListTest {

  @Test
  void singleElementReversalTestShouldReturnTheSameElement() {
    ListNode single = new ListNode(1);
    ListNode expected = new ListNode(1);
    ReorderList.reorderList(single);
    assertEquals(expected, single);
  }
}
