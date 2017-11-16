package com.bvan.javastart.lesson5.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 100; n <= 120; n++) {
            System.out.println(n);
        }
        System.out.println();

        for (int n = 0; n <= 100; n += 10) {
            System.out.println(n);
        }
    }
}
