package com.bvan.javastart.lesson8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}
        };

        int elem = m1[2][0];
        System.out.println(elem);

        int[][] m2 = new int[2][4];
        MatrixUtils.printMatrix(m2);

        int[][] m3 = new int[3][];
        MatrixUtils.printMatrix(m3);

        int[][] multiplicationTable = createMultiplicationTable(10);
        MatrixUtils.printMatrix(multiplicationTable);
    }

    public static int[][] createMultiplicationTable(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
