package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class LinkedListMergeTest {

  @SuppressWarnings({"ConstantValue"})
  // - No Elements returns nothing
  @Test
  void whenMergingNullHeadsItShouldThrowIllegalStateException() {
    ListNode output = LinkedListMerge.mergeTwoLists(null, null);
    assertNull(output);
  }

  @Test
  void whenMergingOneNullHeadsItShouldReturnTheSameHead() {
    ListNode inputNode = new ListNode(1);
    ListNode outputNode;
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
    assertEquals(List.of(1, 4), inputNode1.toList());
  }

  // TODO
  // Cases

  // - Ensure that the order of the elements does not matter
  // - One element and no element returns one element
  // - One element and one element returns two elements sorted
  // - Two elements and one element returns three elements sorted
  // - Two elements and two elements return four elements sorted
  // - check failed test case
  @Test
  void checkCaseWithBothListsHavingMultipleValueOf2ElementsEachShouldBeAbleToMerge() {
    ListNode inputNode1 = ListNode.build(List.of(1, 4));
    ListNode inputNode2 = ListNode.build(List.of(2, 3));
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(List.of(1, 2, 3, 4), outputNode.toList());
  }

  @Test
  void checkFailedCase() {
    ListNode inputNode1 = ListNode.build(List.of(1, 2, 4));
    ListNode inputNode2 = ListNode.build(List.of(1, 3, 4));
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(List.of(1, 1, 2, 3, 4, 4), outputNode.toList());
  }

  @Test
  void testInsertionOfASingleElementInAListShouldMergeTheElementAtTheRightPosition() {
    ListNode inputNode1 = ListNode.build(List.of(1, 2, 4));
    ListNode inputNode2 = new ListNode(3);
    ListNode outputNode = LinkedListMerge.mergeTwoLists(inputNode1, inputNode2);
    assertEquals(List.of(1, 2, 3, 4), outputNode.toList());
  }
}
