package org.bank;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BuddyStringTest {

  @Test
  void whenEmptyInputStrings_ReturnFalse() {
    assertFalse(BuddyString.buddyStrings("", ""));
  }

  @Test
  void whenInputStringsLengthDoNotMatch_ReturnFalse() {
    assertFalse(BuddyString.buddyStrings("abv", "abvdd"));
  }

  @Test
  void whenInputStringsLengthMatchAndLengthIsLessThan2_ReturnFalse() {
    assertFalse(BuddyString.buddyStrings("a", "a"));
  }
}
