package org.bank;

public class BuddyString {
  public static boolean buddyStrings(String s, String goal) {
    if (s.isEmpty() || s.length() == 1) return false;
    else return s.length() == goal.length();
  }
}
