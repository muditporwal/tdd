package org.bank;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {
  public static boolean buddyStrings(String s, String goal) {
    if (s.isEmpty() || s.length() == 1) return false;
    else if (s.length() != goal.length()) return false;
    else {
      return repeating(s, goal) || difference(s, goal);
    }
  }

  static boolean repeating(String s, String goal) {
    if (!s.equals(goal)) return false;
    Set<Character> characters = new HashSet<>();
    int bound = s.length();
    for (int i = 0; i < bound; i++) {
      Character charAt = s.charAt(i);
      characters.add(charAt);
    }
    return goal.length() > characters.size(); // Implies there are recurring characters
  }

  static boolean difference(String s, String goal) {
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        char[] sChar = s.toCharArray();
        char swap = sChar[i];
        sChar[i] = sChar[j];
        sChar[j] = swap;
        String swapGoal = String.copyValueOf(sChar);
        if (swapGoal.equals(goal)) {
          return true;
        }
      }
    }
    return false;
  }
}
