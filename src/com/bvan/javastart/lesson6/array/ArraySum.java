package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        // Input
        int[] array = {10, 30, 15, 20};

        // BL
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            sum += elem;
//        }

        int sum = 0;
        for (int elem : array) { // FOR-EACH, read only
            sum += elem;
        }

        // Output
        System.out.println(Arrays.toString(array));
        System.out.println("sum = " + sum);
    }
}
