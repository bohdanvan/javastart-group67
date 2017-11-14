package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
        int n = -10;

        String gender;
        switch (n) {
            case 1:
                gender = "male";
                break;
            case 2:
                gender = "female";
                break;
            default:
                gender = "undefined";
        }

        System.out.println(gender);
    }
}
