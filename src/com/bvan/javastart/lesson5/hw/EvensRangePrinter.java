package com.bvan.javastart.lesson5.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter from : ");
        int from = scan.nextInt();

        System.out.println("Enter to: ");
        int to = scan.nextInt();

        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.println(n);
        }
    }
}
