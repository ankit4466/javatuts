package com.company;

import java.util.Locale;

public class CH14_string {
    public static void main(String[] args) {
        String name = new String("Ankit is all goood    ");
        System.out.println(name.trim());  //removes space from front and end
        // System.out.println(name.toUpperCase());    coverts into upper case (result: ANKIT IS ALL GOOD)
        // System.out.println(name.toLowerCase());    coverts into Lower case (result: ankit is all good)

        System.out.println(name.substring(2));  //slicing. (result: kit is all good)
        System.out.println(name.substring(2,5));  //slicing. (result: kit)

        String nam = new String("good day");    //replacing of character
        System.out.println(nam.replace('o','e'));

        System.out.println(nam.startsWith("g"));  // returns true or false after checking
        System.out.println(nam.endsWith("g"));  // returns true or false after checking

        System.out.println(nam.charAt(2));      //prints character at certain index
        System.out.println(nam.indexOf("o"));      //prints index at certain character
        System.out.println(nam.indexOf("g",2)); //prints index at certain character from index 2 onwards
        System.out.println("DONE");


    }
}
