package com.bvan.javastart.lesson8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixUtils {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
