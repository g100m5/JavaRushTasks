package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));


        int sum = 0;

        for(int x = 0; x < 3; x++ ) {

            if (Integer.parseInt(reader.readLine()) > 0) {
                sum = sum + 1;
            }

        }


        System.out.println(sum);

    }
}
