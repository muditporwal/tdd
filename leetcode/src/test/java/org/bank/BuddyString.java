package org.bank;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class BuddyString {
  public static boolean buddyStrings(String s, String goal) {
    if (s.isEmpty() || s.length() == 1) return false;
    else if (s.length() != goal.length()) return false;
    else {
      return equalAndRepeating(s, goal) || difference(s, goal);
    }
  }

  static boolean equalAndRepeating(String s, String goal) {
    if (!s.equals(goal))
      return false; // If the strings are not equal, then no need to check for recurring characters
    Set<Character> characters = new HashSet<>();
    int bound = s.length();
    for (int i = 0; i < bound; i++) {
      Character charAt = s.charAt(i);
      characters.add(charAt);
    }
    return goal.length() > characters.size(); // Implies there are recurring characters
  }

  static boolean difference(String s, String goal) {
    if (s.equals(goal)) return false;
    int countOfDifferences = 0;
    LinkedList<Integer> indices = new LinkedList<>();
    int bound = (s.length() + 1) / 2;
    for (int i = 0; i < bound; i++) {
      if (s.charAt(i) != goal.charAt(i)) {
        countOfDifferences++;
        if (countOfDifferences > 2) return false;
        else indices.add(i);
      }

      int revIndex = s.length() - (i + 1); // 0 based index and i starts at 0
      if (s.charAt(revIndex) != goal.charAt(revIndex)) {
        countOfDifferences++;
        if (countOfDifferences > 2) return false;
        else indices.add(revIndex);
      }
    }
    if (countOfDifferences == 1) return false;
    return s.charAt(indices.get(0)) == goal.charAt(indices.get(1))
        && s.charAt(indices.get(1)) == goal.charAt(indices.get(0));
  }
}
