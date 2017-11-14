package com.bvan.javastart.prev_lessons;

/**
 * @author bvanchuhov
 */
public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 971238;

        System.out.println(n / 1000 % 10);
        System.out.println(n / 100 % 10);
        System.out.println(n / 100 % 10);
        System.out.println(n / 10 % 10);
        System.out.println(n % 10);
    }
}
