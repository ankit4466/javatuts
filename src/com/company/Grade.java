package com.company;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B'; //Original Grade
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decryting the Grade
         grade = (char)(grade-8);
        System.out.println(grade);
    }
}