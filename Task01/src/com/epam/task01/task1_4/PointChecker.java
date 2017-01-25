package com.epam.task01.task1_4;

/**
 * Class verifies that point with current coordinates belongs to definite area
 */
public class PointChecker {

    /**
     * Method gets values of coordinates, validates them, checks, does that point belong to definite area
     * and returns answer
     *
     * @param x coordinate x
     * @param y coordinate y
     * @return boolean value: true - point belongs to area
     */
    public boolean checkPoint(double x, double y) throws Exception {
        boolean validation = validateCoordinate(x) && validateCoordinate(y);
        if (!validation) {
            throw new Exception("Incorrect coordinate");
        }
        boolean positionX = ((y > 0.0) && (x >= -2.0) && (x <= 2.0)) || ((y <= 0.0) && (x <= 4.0) && (x >= -4.0));
        boolean positionY = (y <= 4.0) && (y >= -3.0);
        return positionX && positionY;
    }

    /**
     * Method get current coordinate ans verifies that it is correct
     *
     * @param coordinate current coordinate
     * @return boolean value: true - value of coordinate is correct
     */
    private boolean validateCoordinate(Double coordinate) {
        return !(coordinate.isInfinite() || coordinate.isNaN());
    }
}
