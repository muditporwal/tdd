package org.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PredictWinnerTest {

    @Test
    void emptyNumberArray_ShouldReturnFalse() {
        int[] nums = new int[0];
        boolean b = PredictWinner.PredictTheWinner(nums);
        assertFalse(b);
    }



}
