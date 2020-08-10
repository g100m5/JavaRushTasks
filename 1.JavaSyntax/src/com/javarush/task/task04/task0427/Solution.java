package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {




    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));

        Double num = Double.parseDouble(reader.readLine());


        if (((num) >= 1) && ((num ) < 10)) {

            if ((num % 2) == 0) {
                System.out.println("четное однозначное число");

            } else {
                System.out.println("нечетное однозначное число");
            }

        }

        if (((num) >= 10) && ((num) < 100)) {

            if ((num % 2) == 0) {
                System.out.println("четное двузначное число");

            } else {
                System.out.println("нечетное двузначное число");
            }


        }

        if (((num) >= 100) && ((num) < 1000)) {

            if ((num % 2) == 0) {
                System.out.println("четное трехзначное число");

            } else {
                System.out.println("нечетное трехзначное число");
            }


        }








    }
}
