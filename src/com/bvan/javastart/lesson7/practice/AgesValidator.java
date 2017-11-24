package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class AgesValidator {

    public static void main(String[] args) {
        int[] array = {10, -15, -20, 18};
        boolean isAges = isAges(array);
        System.out.println(isAges);
    }

    public static boolean isAges(int[] array) {
        for (int elem : array) {
            if (!isAge(elem)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isAge(int elem) {
        return elem >= 1 && elem <= 120;
    }
}
