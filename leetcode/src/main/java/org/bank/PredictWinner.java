package org.bank;

class PredictWinner {
  public static boolean PredictTheWinner(int[] nums) {
    return getPossibleResults(nums, 0, nums.length - 1, true,PlayResult.newGame());
  }

  static boolean getPossibleResults(
      int[] nums, int left, int right, boolean isPlayer1, PlayResult parent) {
    if (nums.length == 0) return true;
    if (nums.length == 1 && isPlayer1)
      return true; // If only 1 player gets to choose and it is player1's turn
    if (right - left == 1) {
      return resultForLast2Moves(isPlayer1, parent, nums[left], nums[right]).doesPlayer1Win();
    }
    else {
      if (getPossibleResults(nums,left+1,right,!isPlayer1, resultForMove(isPlayer1, parent, nums[left]))) return true;
      if (getPossibleResults(nums,left,right-1,!isPlayer1, resultForMove(isPlayer1, parent, nums[right]))) return true;
      return false;
    }
  }

  private static PlayResult resultForLast2Moves(boolean isPlayer1, PlayResult parent, int l, int r) {
    if (r >= l) {
      PlayResult res = resultForMove(isPlayer1, parent, r);
      return resultForMove(!isPlayer1, res, l); // toggle player for move
    } else {
      PlayResult res = resultForMove(isPlayer1, parent, l);
      return resultForMove(!isPlayer1, res, r); // toggle player for move
    }
  }

  private static PlayResult resultForMove(boolean isPlayer1, PlayResult parent, int score) {
    if (isPlayer1) {
      return parent.appendToPlayer1(score);
    }
    else {
      return parent.appendToPlayer2(score);
    }
  }


  record PlayResult(int player1score, int player2score) {
    public static PlayResult newGame() {
      return new PlayResult(0, 0);
    }

    PlayResult appendToPlayer1(int score) {
      return new PlayResult(player1score() + score, player2score());
    }

    PlayResult appendToPlayer2(int score) {
      return new PlayResult(player1score(), player2score() + score);
    }

    public boolean doesPlayer1Win() {
      return player1score() >= player2score();
    }
  }
}
