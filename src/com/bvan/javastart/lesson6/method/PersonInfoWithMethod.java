package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class PersonInfoWithMethod {

    public static void main(String[] args) {
        printHelloMessage("Taras", 25);
        printHelloMessage("Ivan", 20);
    }

    public static void printHelloMessage(String name, int age) {
        System.out.println(helloMessage(name, age));
    }

    public static String helloMessage(String name, int age) {
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        return message;
    }
}
