package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int x = 10; x > 0; x--) {

            list.add(reader.readLine());
        }



        int z = 0;

        //System.out.println(list.size());

        for (int y = 1; y < list.size(); y++) {

            if (list.get(z).length() > list.get(y).length()) {
                System.out.println(y);

                break;
            }

            z++;


        }






    }
}

