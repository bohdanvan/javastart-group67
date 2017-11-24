package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class TeenagersCounter {

    public static void main(String[] args) {
        int[] ages = {10, 15, 20, 18};
        int count = countTeenagers(ages);
        System.out.println("count = " + count);
    }

    public static int countTeenagers(int[] ages) {
        int count = 0;
        for (int age : ages) {
            if (isTeenager(age)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isTeenager(int age) {
        return age >= 12 && age <= 18;
    }
}
