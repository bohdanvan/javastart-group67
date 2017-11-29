package com.bvan.javastart.lesson8.date;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class OldDateExample {

    public static void main(String[] args) {
        Date d1 = new Date(); // mutable
        System.out.println(d1);

        d1.setTime(0L);
        System.out.println(d1);
    }
}
