package com.epam.task01.task1_5;


/**
 * Class raised argument to definite power depending on positive argument or negative
 */
public class NumberPerformer {

    /**
     * Method gets array of parameters, verifies that there are only 3 arguments, validates values, checks,
     * positive or negative argument is and raises current argument to power 3, if it is positive. Otherwise,
     * it raises argument to power 4
     *
     * @param args array of arguments
     * @return array of result values
     */
    public double[] performAction(double[] args) throws Exception {
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
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 0) {
                args[i] = Math.pow(args[i], 4);
            } else {
                args[i] = Math.pow(args[i], 3);
            }
        }
        return args;
    }

    /**
     * Method get current value and verifies that it is correct
     *
     * @param number current coordinate
     * @return boolean value: true - value is correct
     */
    private boolean validateNumber(Double number) {
        return !(number.isInfinite() || number.isNaN());
    }
}
