package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListMergeTest {

  @Test
  void whenMergingNullHeadsItShouldThrowIllegalStateException() {
    Assertions.assertThrowsExactly(
        IllegalStateException.class, () -> LinkedListMerge.mergeTwoLists(null, null));
  }

  @Test
  void whenMergingOneNullHeadsItShouldReturnTheSameHead() {
    ListNode inputNode = new ListNode(1);
    ListNode outputNode;
    outputNode = LinkedListMerge.mergeTwoLists(null, inputNode);
    assertEquals(inputNode, outputNode);
    outputNode = LinkedListMerge.mergeTwoLists(null, inputNode);
    assertEquals(inputNode, outputNode);
  }
}
