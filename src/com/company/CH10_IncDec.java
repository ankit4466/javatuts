package com.company;

public class CH10_IncDec {
    public static void main(String[] args) {
        // INCREMENT i++
        int i=10;
        int c = i++;
        System.out.println(c);
        System.out.println("___");
        System.out.println(i);
        System.out.println("_____");
        System.out.println(i);
        System.out.println("___END1__");

        // Increment ++j
        int j= ++i;     // Here i is 11 due to previous commands
        System.out.println(j);
        System.out.println("_________");
        System.out.println(i);

        //conclusion:
        // i++ = first value is assigned to variable(b=10) then incremented(11)
        // ++i = first value is incremented (12) and then assigned to variable (12)

    }
}
