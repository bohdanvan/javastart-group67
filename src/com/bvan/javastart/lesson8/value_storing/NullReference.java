package com.bvan.javastart.lesson8.value_storing;

/**
 * @author bvanchuhov
 */
public class NullReference {

    public static void main(String[] args) {
        String s = null;
        if (s != null) {
            int length = s.length();
            System.out.println("length = " + length);
        }
    }
}
