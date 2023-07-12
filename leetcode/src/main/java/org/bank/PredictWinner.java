package org.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PredictWinner {
    public static boolean PredictTheWinner(int[] nums) {
        if(nums.length==1 || nums.length==2) return true;
            //first choice is of player 1 and even if the two numbers are equal 1 still wins
            //No matter if it is 3 numbers the choice to player2 is only once
        else if (nums.length ==0) return false;
        List<PlayResult> results = getPossibleResults(nums, 0,nums.length-1);
        return results.stream().anyMatch(p -> p.player1score >= p.player2score);
    }

    static List<PlayResult> getPossibleResults(int[] nums, int leftIndex, int rightIndex) {
        if (nums.length==0) return Collections.emptyList();
        else {
         if (leftIndex >= rightIndex) {
            int score = nums[leftIndex];
            return Collections.singletonList(new PlayResult(score,0));
            }
            return Collections.emptyList();
        }
    }


    record PlayResult(int player1score , int player2score) {
        PlayResult appendToPlayer1(int score){
            return new PlayResult(player1score()+score,player2score());
        }

        PlayResult appendToPlayer2(int score){
            return new PlayResult(player1score(),player2score()+score);
        }
    }
}
