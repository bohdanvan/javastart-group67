package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile {

    public static void main(String[] args) {
        int day = 1; // (1)

        while (day <= 5) { // (2)
            System.out.println(day + " - Work");
            day++; // (3)
        }

        System.out.println("Friends");
    }
}
