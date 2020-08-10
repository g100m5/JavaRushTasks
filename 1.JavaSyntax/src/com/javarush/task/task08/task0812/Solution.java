package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList <Integer> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int counter = 1;
        int tmp = 1;

        for (int y = 1; y < list.size(); y++) {

            if (list.get(y - 1).equals(list.get(y))) {
                tmp++;

                if(tmp > counter) {
                    counter = tmp;
                }

            } else
                tmp = 1;
        }

        System.out.println(counter);

    }
}