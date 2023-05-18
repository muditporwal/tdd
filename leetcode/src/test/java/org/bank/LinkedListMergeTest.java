package org.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListMergeTest {

  @Test
  void whenMergingNullHeadsItShouldThrowIllegalStateException() {
    Assertions.assertThrowsExactly(
        IllegalStateException.class, () -> LinkedListMerge.mergeTwoLists(null, null));
  }
}
