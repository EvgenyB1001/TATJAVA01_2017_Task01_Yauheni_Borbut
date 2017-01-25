package com.epam.task01;

import com.epam.task01.task1_1.RuleChecker;
import com.epam.task01.task1_10.Matrix;
import com.epam.task01.task1_2.ExpressionCalculator;
import com.epam.task01.task1_3.TriangleCalculator;
import com.epam.task01.task1_4.PointChecker;
import com.epam.task01.task1_5.NumberPerformer;
import com.epam.task01.task1_6.SumCalculator;
import com.epam.task01.task1_7.FunctionCalculator;
import com.epam.task01.task1_8.SumNaturalCalculator;
import com.epam.task01.task1_9.ArrayPerformer;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Task01_1 : " + new RuleChecker().checkNumber(1001));
            System.out.println("Task01_2 : " + new ExpressionCalculator().calculate(1.0, 2.0, 3.0));
            System.out.println("Task01_3 : square - " + new TriangleCalculator().calculateSquare(2.0, 2.0)
                    + " perimeter - " + new TriangleCalculator().calculatePerimeter(2.5, 2.5));
            System.out.println("Task01_4 : " + new PointChecker().checkPoint(2.0, 3.0));
            double[] args1 = new double[]{2.0, 3.0, -3.0};
            int[] args2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] args3 = new int[]{1, 2, 3, 4, 5, 6};
            new NumberPerformer().performAction(args1);
            System.out.println("Task01_5 : " + args1[0] + " " + args1[1] + " " + args1[2]);
            System.out.println("Task01_6 : " + new SumCalculator().calculateSum(args1));
            System.out.println("Task01_7 : ");
            new FunctionCalculator().calculateFunction(1.0, 2.0, 0.05);
            System.out.println("Task01_8 : " + new SumNaturalCalculator().calculate(args2, 4));
            System.out.print("Task01_9 : ");
            int[] array = new ArrayPerformer().combineArrays(args2, args3, 2);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.print("\nTask01_10 : \n");
            int n = 4;
            int[][] arr = new Matrix().createMatrix(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
