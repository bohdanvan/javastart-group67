package com.bvan.javastart.lesson5.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Min3ArgsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        scanner.close();

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println("Min = " + min);
    }
}
