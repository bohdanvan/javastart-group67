package com.bvan.javastart.prev_lessons;

/**
 * @author bvanchuhov
 */
public class AverageCalculator {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        int avg = a / 2 + b / 2 + (a % 2 + b % 2) / 2;

        System.out.println("avg = " + avg);
    }
}
