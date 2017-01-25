package com.epam.task01.task1_2;

import java.math.BigDecimal;

/**
 * Class calculates definite expression, using numbers got as parameters
 */
public class ExpressionCalculator {

    /**
     * Method gets numbers as parameters, validates them, calculates the expression
     * and returns result of calculation
     *
     * @param a the first parameter
     * @param b the second parameter
     * @param c the third parameter
     * @return result of calculation in double type
     */
    public double calculate(Double a, Double b, Double c) throws Exception {
        if (!(validateNumber(a) && validateNumber(b) && validateNumber(c))) {
            throw new Exception("Incorrect input numbers");
        }
        if (compareToZero(a) || compareToZero(b)) {
            throw new Exception("Division by zero");
        }
        if (Double.compare(b * b + 4 * a * c, 0) < 0) {
            throw new Exception("Irrational square roots");
        }
        BigDecimal firstParam = new BigDecimal(a);
        BigDecimal secondParam = new BigDecimal(b);
        BigDecimal thirdParam = new BigDecimal(c);
        BigDecimal result = new BigDecimal(Math.sqrt(secondParam.multiply(secondParam)
                .add(firstParam.multiply(thirdParam).multiply(new BigDecimal("4.0"))).doubleValue()))
                .add(secondParam).divide(firstParam.multiply(new BigDecimal("2.0")))
                .subtract(firstParam.multiply(firstParam).multiply(firstParam).multiply(thirdParam))
                .add((new BigDecimal("1.0").divide(secondParam.multiply(secondParam))));
        return result.doubleValue();
    }

    /**
     * Method validate current number to be neither NaN nor Positive Infinity, nor Negative Infinity
     *
     * @param number current number to validate
     * @return boolean value: true - number is correct
     */
    private boolean validateNumber(Double number) {
        return !(number.isNaN() || number.isInfinite());
    }

    /**
     * Method compare current number with zero
     *
     * @param number current number
     * @return boolean value: true - number equals zero
     */
    private boolean compareToZero(Double number) {
        return ((1 / number) == Double.POSITIVE_INFINITY);
    }
}
