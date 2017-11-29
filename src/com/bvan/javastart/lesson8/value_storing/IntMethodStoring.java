package com.bvan.javastart.lesson8.value_storing;

/**
 * @author bvanchuhov
 */
public class IntMethodStoring {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println(x);
    }

    private static int inc(int x) {
        return x + 1;
    }
}
