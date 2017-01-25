package com.epam.task01.task1_6;

/**
 * Class sums maximal and minimal value of input numbers
 */
public class SumCalculator {

    /**
     * Method gets array of arguments, validates number and values of arguments, searches max and min values
     * and sums them
     *
     * @param args array of input values
     * @return sum of max and min values
     */
    public double calculateSum(double[] args) throws Exception {
        if (args == null) {
            throw new Exception("arguments not initialized");
        }
        if (args.length != 3) {
            throw new Exception("invalid number of arguments");
        }
        boolean validation = validateNumber(args[0]) && validateNumber(args[1]) && validateNumber(args[2]);
        if (!validation) {
            throw new Exception("Invalid values of numbers");
        }
        double min = args[0], max = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            } else if (args[i] > max) {
                max = args[i];
            }
        }
        return (max + min);
    }

    /**
     * Method get current value ans verifies that it is correct
     *
     * @param number current value
     * @return boolean value: true - value is correct
     */
    private boolean validateNumber(Double number) {
        return !(number.isInfinite() || number.isNaN());
    }
}
