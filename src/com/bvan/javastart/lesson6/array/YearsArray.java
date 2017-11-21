package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsArray {

    public static void main(String[] args) {
        int[] years = new int[18];

        for (int i = 0; i < years.length; i++) {
            years[i] = i + 2000;
        }

        System.out.println(Arrays.toString(years));
    }
}
