package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneX {

    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Do you have good mood? (yes/no) ");
        boolean goodMood = scanner.next().equals("yes");

        System.out.print("Does your girl want? (yes/no) ");
        boolean girlWants = scanner.next().equals("yes");

        System.out.print("Today is Sunday, isn't it? (yes/no) ");
        boolean isSunday = scanner.next().equals("yes");

        if (!isSunday && (goodMood || girlWants) && money >= iPhonePrice) {
            System.out.println("Buy");
            money -= iPhonePrice;
        } else {
            System.out.println("Not buy");
        }
        System.out.println("Money left: " + money);
    }
}
