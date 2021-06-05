package com.company;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("Program to convert Kilometer into miles");
        Scanner scn = new Scanner(System.in);
        int kilo = scn.nextInt();
        double miles = kilo * 1.62;
        System.out.println("in miles it is " +miles);

    }
}
