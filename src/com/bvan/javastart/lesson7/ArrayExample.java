package com.bvan.javastart.lesson7;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        array[3] = 10;
        int length = array.length;
        System.out.println(length);

        System.out.println(Arrays.toString(array));
    }
}
