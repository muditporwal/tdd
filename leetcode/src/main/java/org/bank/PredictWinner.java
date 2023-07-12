package org.bank;

class PredictWinner {
    public static boolean PredictTheWinner(int[] nums) {
        if(nums.length==1 || nums.length==2) return true; //first choice is of player 1 and even if the two numbers are equal 1 still wins
        return false;
    }
}
