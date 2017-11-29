package com.bvan.javastart.lesson8.value_storing;

/**
 * @author bvanchuhov
 */
public class SumCalculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = sum(a, b);

        System.out.println(c);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
