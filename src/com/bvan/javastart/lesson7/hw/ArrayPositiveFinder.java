package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class ArrayPositiveFinder {

    public static void main(String[] args) {
        int[] array = {-3, 0, -1, 20, -2, 10};

        int index = findFirstPositiveElem(null);

        System.out.println("index = " + index);
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstPositiveElem(int[] array) {
        for (int elem : array) {
            if (elem > 0) {
                return elem;
            }
        }
        return Integer.MIN_VALUE;
    }
}
