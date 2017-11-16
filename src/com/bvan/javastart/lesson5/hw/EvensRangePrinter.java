package com.bvan.javastart.lesson5.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int from = scan.nextInt();
        System.out.println("enter number 2: ");
        int to = scan.nextInt();
        scan.close();

        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.println(n);
        }
    }
}
