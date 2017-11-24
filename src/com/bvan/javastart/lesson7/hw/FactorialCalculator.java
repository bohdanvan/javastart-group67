package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        long x = factorial(-100);
        System.out.println(x); // 6
    }

    public static long factorial(int n) { // signature
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }

        long res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
