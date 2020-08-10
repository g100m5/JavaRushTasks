package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());



        if ((a == b) && (b != c)) {

            System.out.print( 3 );

        }

        if ((a == c) && (b != c)) {

            System.out.print( 2 );

        }

        if ((b == c) && (a != b)) {

            System.out.print( 1 );

        }


    }
}
