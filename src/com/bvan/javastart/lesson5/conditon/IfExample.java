package com.bvan.javastart.lesson5.conditon;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 7;

        if (x < 20) {
            if (x >= 5 && x <= 10) {
                System.out.println("4");
            }
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        System.out.println("3");
    }
}
