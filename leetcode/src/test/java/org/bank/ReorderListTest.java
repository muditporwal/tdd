package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ReorderListTest {

  @Test
  void singleElementReversalTestShouldReturnTheSameElement() {
    ListNode input = new ListNode(1);
    ListNode expected = new ListNode(1);
    ReorderList.reorderList(input);
    assertEquals(expected, input);
  }

  @Test
  void twoElementReversalTestShouldReturnTheSameElements() {
    ListNode input = ListNode.build(List.of(1, 2));
    ListNode expected = ListNode.build(List.of(1, 2));
    ReorderList.reorderList(input);
    assertEquals(expected, input);
  }

  @Test
  void threeElementReversalTestShouldReturnTheSameElements() {
    ListNode input = ListNode.build(List.of(1, 2, 3));
    ListNode expected = ListNode.build(List.of(1, 3, 2));
    ReorderList.reorderList(input);
    assertEquals(expected, input);
  }
}
