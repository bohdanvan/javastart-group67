package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class ConditionChainExample {

    public static void main(String[] args) {
        int age = -25;

        if (age <= 0 || age >= 120) {
            System.out.println("Illegal age");
            System.exit(0);
        }

        String ageCategory;

        if (age <= 11) {
            ageCategory = "baby";
        } else if (age <= 18) {
            ageCategory = "teenager";
        } else if (age <= 60) {
            ageCategory = "adult";
        } else {
            ageCategory = "old";
        }

        System.out.println(ageCategory);
    }
}
