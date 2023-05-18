package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
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
    assertEquals(List.of(1, 2), outputNode.toList());
  }

  @Test
  void whenMergingTwoListsWithTwoElementListShouldReturnMergedList() {
    ListNode inputNode1 = ListNode.build(List.of(1, 3));
    ListNode inputNode2 = new ListNode(2);
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(List.of(1, 2, 3), outputNode.toList());
  }

  @Test
  void createBuilderForCleanerInterface() {
    ListNode outputNode = ListNode.build(List.of(1, 2, 3));
    assertEquals(List.of(1, 2, 3), outputNode.toList());
  }

  @Test
  void checkToListForANodeShouldReturnSameValuesInOrder() {
    ListNode inputNode1 = ListNode.build(List.of(1, 4));
    List<Integer> listOut = inputNode1.toList();
    assertEquals(List.of(1, 4), listOut);
  }

  // TODO
  // - check failed test case
  @Test
  void checkCaseWithBothListsHavingMultipleValueOf2ElementsEachShouldBeAbleToMerge() {
    ListNode inputNode1 = ListNode.build(List.of(1, 4));
    ListNode inputNode2 = ListNode.build(List.of(2, 3));
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    List<Integer> listOut = outputNode.toList();
    assertEquals(List.of(1, 2, 3, 4), listOut);
  }
}
