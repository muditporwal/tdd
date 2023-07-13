package org.bank;

import java.util.Collections;
import java.util.List;

class PredictWinner {
  public static boolean PredictTheWinner(int[] nums) {
    if (nums.length == 1 || nums.length == 2) return true;
    // first choice is of player 1 and even if the two numbers are equal 1 still wins
    // No matter if it is 3 numbers the choice to player2 is only once
    else if (nums.length == 0) return false;
    PlayResult result = getPossibleResults(nums, 0, nums.length - 1);
    return result.doesPlayer1Win();
  }

  static PlayResult getPossibleResults(int[] nums, int leftIndex, int rightIndex) {
    if (nums.length == 0) return PlayResult.empty();
    else {
      if (leftIndex >= rightIndex) {
        int score = nums[leftIndex];
        return new PlayResult(score, 0);
      } else {
        PlayResult l_l1 = new PlayResult(nums[leftIndex],nums[leftIndex+1]);
        PlayResult subTree = getPossibleResults(nums,leftIndex+2,rightIndex);
        l_l1.appendToPlayers(subTree.player1score,subTree.player2score);
        // Four Possibilities
        // LI1, LI1+1
          // Call Subtree ; Return the max
          // Add these values
        // LI1, RI1
          // Call Subtree ; Return the max
          // Add these values
        // RI1 , LI1
          // Call Subtree ; Return the max
          // Add these values
        // RI1, RI-1
          // Call Subtree ; Return the max
          // Add these values
        // Return the Max
        return null;
      }
    }
  }

  record PlayResult(int player1score, int player2score) {
    public static PlayResult empty() {
      return new PlayResult(0,0);
    }

    PlayResult appendToPlayer1(int score) {
      return new PlayResult(player1score() + score, player2score());
    }

    PlayResult appendToPlayer2(int score) {
      return new PlayResult(player1score(), player2score() + score);
    }

    public void appendToPlayers(int p1score, int p2score) {
      new PlayResult(player1score() + p1score, player2score() + p2score);
    }

    public boolean doesPlayer1Win() {
      return player1score() >= player2score();
    }
  }
}
