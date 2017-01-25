package com.epam.task01.task1_3;

import java.math.BigDecimal;

/**
 * Class calculates square and perimeter of orthogonal triangle
 */
public class TriangleCalculator {

    /**
     * Method gets values of cathetuses, validates them, calculates square of triangle and returns result
     *
     * @param a first cathetus
     * @param b second cathetus
     * @return square of triangle
     */
    public Double calculateSquare(Double a, Double b) throws Exception {
        if (!validateSide(a) || !validateSide(b)) {
            throw new Exception("Values of sides are incorrect");
        }
        BigDecimal firstSide = new BigDecimal(a.toString());
        BigDecimal secondSide = new BigDecimal(b.toString());
        return firstSide.multiply(secondSide).divide(new BigDecimal("2.0")).doubleValue();
    }

    /**
     * Method gets values of cathetuses, validates them, calculates perimeter of triangle and returns result
     *
     * @param a first cathetus
     * @param b second cathetus
     * @return perimeter of triangle
     */
    public Double calculatePerimeter(Double a, Double b) throws Exception {
        if (!validateSide(a) || !validateSide(b)) {
            throw new Exception("Values of sides are incorrect");
        }
        BigDecimal firstSide = new BigDecimal(a);
        BigDecimal secondSide = new BigDecimal(b);
        BigDecimal thirdSide = new BigDecimal(Math.sqrt(firstSide.multiply(firstSide)
                .add(secondSide.multiply(secondSide)).doubleValue()));
        return firstSide.add(secondSide).add(thirdSide).doubleValue();
    }

    /**
     * Method validate current value of side to be neither NaN nor Positive Infinity, nor Negative Infinity,
     * nor negative, nor equal to zero
     *
     * @param side current number to validate
     * @return boolean value: true - number is correct
     */
    private boolean validateSide(Double side) {
        return !(side.isNaN() || side.isInfinite() || (side <= 0));
    }
}
