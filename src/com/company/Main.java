package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //             01234
        String name = "danny";
        //    console.log(`Last index of n: ${name.indexOf('n')} in string = ${name}`)
        System.out.printf("First index of n: %d in string = %s", name.indexOf('n'), name);
        System.out.println();
        System.out.printf("Last index of n: %d in string = %s", name.lastIndexOf('n'), name);
        System.out.println();
        //System.out.printf(name.length());
        String line = String.format("Last index of n: %d in string = %s", name.lastIndexOf('n'), name);
        System.out.println(line);
        System.out.println();
        System.out.println("your name is \"dany\"");
        System.out.println("c:\\users");

        System.out.println("Lower case of ABCde " + "ABCde".toUpperCase());
        System.out.println("Lower case of ABCde " + "ABCde".toLowerCase());

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));

        System.out.println("What is your name?");
        String your_name = scanner.next();
        System.out.printf("Your name is: %s", your_name);

        // use scanner to input your first name
        // print how many letters in the string
        // use scanner to input your last name
        // sue concat do join the strings
        // print the full name using printf + %s + %s

    }
}
