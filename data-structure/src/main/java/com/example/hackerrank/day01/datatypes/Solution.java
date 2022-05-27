package com.example.hackerrank.day01.datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        Integer i2 = Integer.parseInt(scan.next());
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
        Double d2 = Double.parseDouble(scan.next());
        System.out.println(d + d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
//        String s2 = scan.nextLine();
//        String s3 = scan.next();
//        String s4 = scan.next();
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
            System.out.println(s + str2);
        }


        scan.close();
    }
}
