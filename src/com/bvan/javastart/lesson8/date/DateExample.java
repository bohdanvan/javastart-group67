package com.bvan.javastart.lesson8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println("hour = " + dt1.getHour());
        System.out.println("second = " + dt1.getSecond());

        LocalDateTime dt2 = dt1.plusDays(10);

        System.out.println("dt1 = " + dt1);
        System.out.println("dt2 = " + dt2);

        LocalDate elvisPresleyBirthDay = LocalDate.of(1935, 1, 8);
        System.out.println("elvisPresleyBirthDay = " + elvisPresleyBirthDay);

        System.out.println(elvisPresleyBirthDay.getDayOfWeek());
    }
}
