package com.bvan.javastart.lesson8.value_storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[5];
        fill(a, 3);
        System.out.println(Arrays.toString(a));
    }

    private static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }
}
