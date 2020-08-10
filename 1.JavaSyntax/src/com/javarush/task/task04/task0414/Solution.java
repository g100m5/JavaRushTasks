package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int x = 365;
        int VIS = 366;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(reader.readLine());

        if ( (year % 400)==0) {

            x = VIS;
        }

        if (((year % 100) != 0) && ((year % 4) == 0)) {

            x = VIS;

        }


        System.out.println("количество дней в году: " + x);

    }
}