package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));


        int sum = 0;
        int nsum = 0;

        for(int x = 0; x < 3; x++ ) {

            Double z = Double.parseDouble(reader.readLine());

            if (z > 0) {
                sum = sum + 1;
            }

            if (z < 0)
            {
                nsum = nsum + 1;
            }

        }


        System.out.println("количество отрицательных чисел: " + nsum);
        System.out.println("количество положительных чисел: " + sum);

    }
}
