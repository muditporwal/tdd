package org.bank;

import org.junit.jupiter.api.Test;

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


}
