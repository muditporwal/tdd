package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BuddyStringTest {

  @Test
  void testSetup() {
    assertTrue(BuddyString.buddyStrings("ab", "ba"));
  }
}
