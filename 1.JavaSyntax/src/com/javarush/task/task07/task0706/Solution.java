package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int[] rooms = new int[15];

       int notodd = 0;
       int odd = 0;


       for(int x = 0; rooms.length > x; x++) {

           rooms[x] = Integer.parseInt(reader.readLine());

             if((x%2)==0) {
               notodd = notodd + rooms[x];
             }

             if((x%2)!=0) {
               odd = odd + rooms[x];
           }

       }


        if (notodd > odd) {

            System.out.println("В домах с четными номерами проживает больше жителей.");

        }

        if (odd > notodd) {

            System.out.println("В домах с нечетными номерами проживает больше жителей.");

        }



    }
}
