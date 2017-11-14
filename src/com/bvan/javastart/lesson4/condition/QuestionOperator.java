package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class QuestionOperator {

    public static void main(String[] args) {
        int x = 100;

//        String message;
//        if (x < 20) {
//            message = "Yes";
//        } else {
//            message = "No";
//        }

        String message = (x < 20) ? "Yes" : "No";

        System.out.println(message);
    }
}
