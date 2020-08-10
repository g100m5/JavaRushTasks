package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double sum = 0.0;
        int iterator = 0;


        while (true) {

            Double x = Double.parseDouble(reader.readLine());
            if (x == -1)
            break;

            sum = sum + x;
            iterator++;
        }


        System.out.println(sum / iterator);

    }
}

