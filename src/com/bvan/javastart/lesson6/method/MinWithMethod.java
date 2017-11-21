package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MinWithMethod {

    // Client
    public static void main(String[] args) {
        int x = min(10, 20); // вызов метода
        int y = min(40, 30);
        int z = x + y;

        System.out.println(z);
    }

    // Creator
    public static int min(int a, int b) { // описание метода
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
