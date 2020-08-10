package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
 //       int in = 0;

        int in1 = in.nextInt();

        if(in1 > 0) {in1 = in1*2;}
        if(in1 < 0) {in1 = in1+1;}


        System.out.println(in1);




    }

}