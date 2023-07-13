package org.bank;

class PredictWinner {
  public static boolean PredictTheWinner(int[] nums) {
    return getPossibleResults(nums, 0, nums.length - 1, true, PlayResult.newGame());
  }

  static boolean getPossibleResults(
      int[] nums, int left, int right, boolean player1, PlayResult parent) {
    if (nums.length == 0) return true;
    if (nums.length == 1 && player1)
      return true; // If only 1 player gets to choose and it is player1's turn
    if (right - left == 1) {
      return resultForLast2Moves(player1, parent, nums[left], nums[right]).doesPlayer1Win();
    } else {
      boolean leftResult =
          getPossibleResults(nums, left + 1, right, !player1, parent.append(player1, nums[left]));
      boolean rightResult =
          getPossibleResults(nums, left, right - 1, !player1, parent.append(player1, nums[right]));
      return player1 && (leftResult || rightResult) || (!player1 && (leftResult && rightResult));
    }
  }

  private static PlayResult resultForLast2Moves(boolean player1, PlayResult parent, int l, int r) {
    if (r >= l) return parent.append(player1, r).append(!player1, l);
    else return parent.append(player1, l).append(!player1, r);
  }

  record PlayResult(int player1score, int player2score) {
    public static PlayResult newGame() {
      return new PlayResult(0, 0);
    }

    PlayResult append(boolean isPlayer1, int score) {
      if (isPlayer1) return new PlayResult(player1score() + score, player2score());
      else return new PlayResult(player1score(), player2score() + score);
    }

    public boolean doesPlayer1Win() {
      return player1score() >= player2score();
    }
  }
}
