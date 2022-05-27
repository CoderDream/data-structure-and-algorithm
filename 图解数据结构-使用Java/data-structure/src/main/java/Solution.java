package com.example.hackerrank.day06.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int j = 0; j < N; j++) {
            String s1 = bufferedReader.readLine().trim();
            int n1 = s1.length();
            StringBuffer a1 = new StringBuffer();
            StringBuffer b1 = new StringBuffer();
            for (int i = 0; i < n1; i++) {
                if (i % 2 == 0) {
                    a1.append(s1.charAt(i));
                } else {
                    b1.append(s1.charAt(i));
                }
            }
            System.out.println(a1 + " " + b1);
        }

        bufferedReader.close();
    }
}
