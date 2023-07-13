package org.bank;

import org.bank.PredictWinner.PlayResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredictWinnerTest {

    @Test
    void emptyNumberArray_ShouldReturnFalse() {
        int[] nums = new int[0];
        boolean b = PredictWinner.PredictTheWinner(nums);
        assertFalse(b);
    }

    @Test
    void singleDigitNumberArray_ShouldReturnTrue() {
        int[] nums = new int[]{1};
        boolean b = PredictWinner.PredictTheWinner(nums);
        assertTrue(b);
    }

    @Test
    void twoDigitNumberArray_ShouldReturnTrue() {
        int[] nums = new int[]{1,2};
        boolean b = PredictWinner.PredictTheWinner(nums);
        assertTrue(b);
    }

    @Test
    void threeDigitNumberArray_ShouldEvaluate() {
        int[] nums = new int[]{1,10,3};
        boolean b = PredictWinner.PredictTheWinner(nums);
        assertFalse(b);

        nums = new int[]{1,3,3};
        b = PredictWinner.PredictTheWinner(nums);
        assertTrue(b);
    }

    @Test
    void playResultsForNoNumbers_ShouldReturnAnEmptyList() {
        int[] nums = new int[0];
        List<PlayResult> possibleResults = PredictWinner.getPossibleResults(nums, 0,nums.length-1);
        Assertions.assertEquals(0, possibleResults.size());
    }

    @Test
    void playResultsForOneNumber_ShouldReturnAListWithASingleElement() {
        int[] nums = new int[]{1};
        List<PlayResult> possibleResults = PredictWinner.getPossibleResults(nums, 0,nums.length-1);
        Assertions.assertEquals(1, possibleResults.size());
        Assertions.assertEquals(1, possibleResults.get(0).player1score());
    }

    @Test
    void platResultForTwoNumbers_ShouldReturnAListWithASingleElement(){
        int[] nums = new int[]{1,2};
        List<PlayResult> possibleResults = PredictWinner.getPossibleResults(nums, 0,nums.length-1);
        Assertions.assertEquals(1, possibleResults.size());
        Assertions.assertEquals(2, possibleResults.get(0).player1score());
    }
}
