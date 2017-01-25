package com.epam.task01.task1_9;

/**
 * Class combines two arrays by special rule. The rule is to insert the second array into the first, place to insert
 * is determined by input argument
 */
public class ArrayPerformer {

    /**
     * Method gets two arrays to combine and argument to determine place of insertion. It validates
     * that arrays are initialized and returns result array
     *
     * @param firstArray  the first array to combine
     * @param secondArray the second array to combine
     * @param k           position of insertion
     */
    public int[] combineArrays(int[] firstArray, int[] secondArray, int k) throws Exception {
        if (firstArray == null || secondArray == null) {
            throw new Exception("Arrays are not initialized");
        }

        if (k >= firstArray.length - 1) {
            throw new Exception("Position to connect is out of bounds");
        }

        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i <= k; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = k + 1; i < k + 1 + secondArray.length; i++) {
            resultArray[i] = secondArray[i - k - 1];
        }

        for (int i = k + 1 + secondArray.length; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i - secondArray.length];
        }
        return resultArray;
    }
}
