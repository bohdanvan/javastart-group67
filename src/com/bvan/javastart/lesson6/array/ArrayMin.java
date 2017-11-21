package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {20, 5, 30, 15, 50, 10};

        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }

        System.out.println("min = " + min);
    }
}
