package com.epam.task01.task1_10;

/**
 * Class creates matrix by special rule. The rule is to fill even line of matrix with numbers of indexes
 * and to fill odd line with indexes in reversed order
 */
public class Matrix {

    /**
     * Method gets order of quadratic matrix, creates matrix according to rule and returns it
     *
     * @param order order of quadratic matrix
     * @return result quadratic matrix
     */
    public int[][] createMatrix(int order) throws Exception {
        if (order % 2 != 0 || order <= 0) {
            throw new Exception("Order of matrix must be even, positive and not equals zero");
        }

        int[][] resultMatrix = new int[order][order];

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if ((i + 1) % 2 != 0) {
                    resultMatrix[i][j] = j;
                } else if ((i + 1) % 2 == 0) {
                    resultMatrix[i][j] = order - j;
                }
            }
        }

        return resultMatrix;
    }
}
