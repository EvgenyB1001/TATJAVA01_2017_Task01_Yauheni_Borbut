package com.epam.task01.task1_8;

/**
 * Class calculates sum of natural numbers, that multiple to definite number
 */
public class SumNaturalCalculator {

    /**
     * Method gets array of numbers and calculates sum of those numbers, that multiple to number
     * also got as argument, returns that sum
     *
     * @param numbers array of natural numbers
     * @param k       number to verify multiple
     * @return sum of definite numbers
     */
    public int calculate(int[] numbers, int k) throws Exception {
        if (numbers == null) {
            throw new Exception("Numbers are not initialized");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
