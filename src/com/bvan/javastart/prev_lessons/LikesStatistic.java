package com.bvan.javastart.prev_lessons;

import java.time.Year;

/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 102;
        int registrationYear = 2013;
        int currentYear = Year.now().getValue();

        double likesPerYear =
                (double)likesCount / (currentYear - registrationYear + 1);

        System.out.println(likesPerYear + " likes / year");
    }
}
