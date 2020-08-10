package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        //switch ()

        if ((a == b) && (b == c)) {
            System.out.print(a + " " + b + " " + c);
        }
            else {

                if ((a == b) && (b != c)) {

                    System.out.print(a + " " + b );

                }

                if ((a == c) && (b != c)) {

                    System.out.print(a + " " + c );

                }

                if ((b == c) && (a != b)) {

                    System.out.print(b + " " + c );

                }
        }

    }
}