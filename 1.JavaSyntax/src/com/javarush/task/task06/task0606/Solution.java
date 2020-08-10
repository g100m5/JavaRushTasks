package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String num = reader.readLine();


        char charArray[] =  num.toCharArray();

        for (int x = 0; x < charArray.length; x++ ) {
            if ((charArray[x] % 2) == 0) {
                even++;
            }
                else {
                    odd++;
            }

        }

        System.out.println( "Even: " + even + " Odd: " + odd);
     //   System.out.println(odd);
    }
}
