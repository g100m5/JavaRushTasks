package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {


       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String sourceFileName = reader.readLine();

        //String sourceFileName = "/home/hostuser/hello.exs";
        reader.close();


        BufferedReader  textFile = new BufferedReader ( new FileReader(sourceFileName) );

        String regex = "\\bworld\\b";
        int count = 0;

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
       // String finalString = textFile.readLine();
        //System.out.println(finalString);

       while (textFile.ready()) {
           Matcher matcher = pattern.matcher(textFile.readLine());


           while (matcher.find()) {
               count++;
           }
       }
      System.out.println(count);

        textFile.close();

    }
}
