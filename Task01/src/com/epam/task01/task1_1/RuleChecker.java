package com.epam.task01.task1_1;

/**
 * Class verifies that number matches to definite rule. The rule: sum of the first two digits from
 * current number and sum of the last two digits must be equal
 */
public class RuleChecker {

    /**
     * Method gets number, validates it to be four-digit and verifies it
     *
     * @param number current number
     * @return boolean value: true - number matches to rule
     */
    public boolean checkNumber(int number) throws Exception {
        if (!validateCapacity(number)) {
            throw new Exception("Not a four-digit number!");
        }
        return ((number / 1000 + number % 1000 / 100) == (number % 100 / 10 + number % 10));
    }

    /**
     * Method validates number to be four-digit
     *
     * @param number current number
     * @return boolean value: true - number is four-digit
     */
    private boolean validateCapacity(int number) {
        return (number / 1000 != 0) && (number / 10000 == 0);
    }
}
