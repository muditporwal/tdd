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
        List<PlayResults> results = getPossibleResults(nums);
        return results.stream().anyMatch(p -> p.player1score >= p.player2score);
    }

    private static List<PlayResults> getPossibleResults(int[] nums) {
        PlayResults result = new PlayResults(4,3);
        return Collections.singletonList(result);
    }


    record PlayResults(int player1score ,int player2score) {
    }
}
