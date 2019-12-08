package com.rizvi.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        boolean checkLeapYear = isLeapYear(year);
        int toalDaysForFirstEightMonth = 0;
        int dayOfTheProgrammer = 256;
        if(checkLeapYear) {
        	System.out.println("leap year");
            toalDaysForFirstEightMonth = 244;
        } else {
            toalDaysForFirstEightMonth = 243;
        }
        dayOfTheProgrammer = dayOfTheProgrammer - toalDaysForFirstEightMonth;
        if(year == 1918) {
        	dayOfTheProgrammer = dayOfTheProgrammer+13;
        }
        return dayOfTheProgrammer+".09."+year;
    }
public static boolean isLeapYear(int year) {
    // assert year >= 1583; // not valid before this date.
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = "";
        if(year >= 1700 && year <=2700) {
            result = solve(year);
            System.out.println(result);
        }
    }
}

// 26.09.1918
//12.09.2000