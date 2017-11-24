package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class LinePrinter {

    public static void main(String[] args) {
        printLine(-4);
        printLine(2);
        printLine(0);
    }

    public static void printLine(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("negative count: " + count);
        }

        for (int n = 0; n < count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
