package com.bvan.javastart.lesson8.bignumber;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class Factorial {

    public static void main(String[] args) {
        BigInteger factorial = factorial(100000);
        System.out.println(factorial);
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }

        BigInteger res = BigInteger.valueOf(1); // immutable
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
