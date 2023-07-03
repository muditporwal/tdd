package org.bank;

public class BuddyString {
  public static boolean buddyStrings(String s, String goal) {
    if (s.isEmpty() || s.length() == 1) return false;
    else if (s.length() != goal.length()) return false;
    else {
      for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < s.length(); j++) {
          if (i != j){
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
      }
      return false;
    }
  }
}
