package com.bvan.javastart.lesson4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        Scanner scan = new Scanner(new File("person.txt"));

        String name = scan.next();
        int age = scan.nextInt();

        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
