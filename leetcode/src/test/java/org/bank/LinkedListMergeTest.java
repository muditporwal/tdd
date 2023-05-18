package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

  @Test
  void whenMergingTwoNodesWithSingleElementShouldReturnMergedList() {
    ListNode inputNode1 = new ListNode(1);
    ListNode inputNode2 = new ListNode(2);
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(1, outputNode.val);
    assertEquals(2, outputNode.next.val);
  }

  @Test
  void whenMergingTwoListsWithTwoElementListShouldReturnMergedList() {
    ListNode inputNode1 = new ListNode(1, new ListNode(3));
    ListNode inputNode2 = new ListNode(2);
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(1, outputNode.val);
    assertEquals(2, outputNode.next.val);
    assertEquals(3, outputNode.next.next.val);
    assertNull(outputNode.next.next.next);
  }
}
