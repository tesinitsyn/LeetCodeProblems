package org.example.Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum twoSum = new TwoSum();
    @Test
    void twoSum() {
        int[] testSet = {1,2,3,4,5,6,7};
        int testTarget = 7;
        int[] result = {3,2};
        assertArrayEquals(result, twoSum.twoSum(testSet, testTarget));
    }
}