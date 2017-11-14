package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // 10...20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 30...20
        for (int n = 30; n >= 20; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 50...100, evens
        int first = 49;
        if (first % 2 != 0) {
            first++;
        }
        for (int n = first; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
