package com.epam.task01.task1_7;

import java.util.ArrayList;

/**
 * Class calculates definite expression using input arguments
 */
public class FunctionCalculator {

    /**
     * Method gets start point, end point and step values, validates them, creates list of results
     * and fills it with values of current argument and result of calculation. Method outputs result in a table
     *
     * @param start  value of start point
     * @param finish value of finish point
     * @param step   value of step
     */
    public void calculateFunction(double start, double finish, double step) throws Exception {
        if (finish < start) {
            throw new Exception("Invalid interval");
        }
        boolean validation = validateValue(start) && validateValue(finish) && validateValue(finish);
        if (!validation) {
            throw new Exception("Invalid values of numbers");
        }

        ArrayList<double[]> result = new ArrayList<>();
        double x = start;
        do {
            double cur = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            result.add(new double[]{x, cur});
            x += step;
        } while (x <= finish);

        for (double[] res : result) {
            System.out.println("Argument: " + res[0] + "    Function: " + res[1]);
        }
    }

    /**
     * Method get current value ans verifies that it is correct
     *
     * @param number current value
     * @return boolean value: true - value of coordinate is correct
     */
    private boolean validateValue(Double number) {
        return !(number.isInfinite() || number.isNaN());
    }
}
