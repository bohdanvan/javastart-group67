package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class SumCalculator {

    public static void main(String[] args) {
        int x = sum(10, 20); // 30
        int y = sum(30, 50); // 80
        int z = sum(x, y);
        System.out.println(z);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
