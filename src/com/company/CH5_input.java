package com.company;
import java.util.Scanner;
public class CH5_input{
    public static void main(String[]args){
        System.out.println("taking inputes");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("Enter the num1");
        float a= sc.nextFloat();
        System.out.println("Enter the num2");
        int b= sc.nextInt();
        float sum = a+b;
        System.out.println("sum is =" +sum);

        }
}