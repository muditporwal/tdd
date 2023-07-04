package org.bank;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

  @Test
  void whenInputStringIs2Characters_CheckAndReturn() {
    assertFalse(BuddyString.buddyStrings("ac", "ad"));
    assertTrue(BuddyString.buddyStrings("aa", "aa"));
    assertTrue(BuddyString.buddyStrings("ab", "ba"));
  }

  @Test
  void whenInputStringIsLarge_CheckAndReturn() {
    assertTrue(BuddyString.buddyStrings("acdc", "acdc"));
    assertFalse(BuddyString.buddyStrings("abba", "baab"));
    assertTrue(BuddyString.buddyStrings("fab", "baf"));
  }

  @Test
  void whenInputStringRepeatingAndSame_ReturnTrue() {
    assertTrue(BuddyString.buddyStrings("aaaaaaacd", "aaaaaaacd"));
    assertFalse(BuddyString.buddyStrings("acd", "acd"));
  }
}
