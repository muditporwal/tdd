package org.bank;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
    if (nums.length == 0 || leftIndex > rightIndex) return PlayResult.empty();
    else {
      if (leftIndex == rightIndex) {
        int score = nums[leftIndex];
        return new PlayResult(score, 0);
      } else {
        // Four Possibilities
        // LI1, LI1+1
          // Call Subtree ; Return the max
          // Add these values
        PlayResult l_l1 = new PlayResult(nums[leftIndex],nums[leftIndex+1]);
        PlayResult subTree_l_l1 = getPossibleResults(nums,leftIndex+2,rightIndex);
        l_l1.appendToPlayers(subTree_l_l1.player1score,subTree_l_l1.player2score);

        // LI1, RI1
          // Call Subtree ; Return the max
          // Add these values
        PlayResult l_r = new PlayResult(nums[leftIndex],nums[rightIndex]);
        PlayResult subTree_l_r = getPossibleResults(nums,leftIndex+1,rightIndex-1);
        l_r.appendToPlayers(subTree_l_r.player1score,subTree_l_r.player2score);
        // RI1 , LI1
          // Call Subtree ; Return the max
          // Add these values
        PlayResult r_l = new PlayResult(nums[rightIndex],nums[leftIndex]);
        PlayResult subTree_r_l = getPossibleResults(nums,leftIndex+1,rightIndex-1);
        r_l.appendToPlayers(subTree_r_l.player1score,subTree_r_l.player2score);
        // RI1, RI-1
          // Call Subtree ; Return the max
          // Add these values
        PlayResult r_r1 = new PlayResult(nums[rightIndex],nums[rightIndex-1]);
        PlayResult subTree_r_r1 = getPossibleResults(nums,leftIndex,rightIndex-2);
        r_r1.appendToPlayers(subTree_r_r1.player1score,subTree_r_r1.player2score);

        // Return the Max
        return Stream.of(l_l1, l_r, r_l, r_r1)
            .max(
                (o1, o2) -> {
                  if (o1.player1score() > o2.player1score()) return 1;
                  if (o1.player1score() == o2.player1score()) return Integer.compare(o2.player2score(), o1.player2score());
                  return -1;
                })
            .orElse(PlayResult.empty());
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
