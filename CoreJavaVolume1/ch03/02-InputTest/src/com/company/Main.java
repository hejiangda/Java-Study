package com.company;

import java.util.*;

public class Main {

    /**
     * 4   * This program demonstrates console input.
     * 5   * @version 1.10 2004-02-10
     * 6   * @author Cay Horstmann
     * 7
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }

}
