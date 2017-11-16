package com.bvan.javastart.lesson5.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class MinCalculator {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        // BL
        int min = (a < b) ? a : b;

        // Output
        System.out.println("Min = " + min);
    }
}
