package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        int x = rangeSum(10, 5);
        System.out.println(x);
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from should be less than to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
