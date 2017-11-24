package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(5);
        printTriangle(7);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }
        for (int count = 1; count <= size; count++) {
            LinePrinter.printLine(count);
        }
    }
}
