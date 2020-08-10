package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        reader.close();

        BufferedReader textFile = new BufferedReader(new FileReader(sourceFileName));
        BufferedWriter writer = new BufferedWriter (new FileWriter(destinationFileName));

        while (textFile.ready()) {

            writer.write(textFile.readLine().replace(".","!"));

  //        Pattern p = Pattern.compile("\\b[0-9]+\\b");
  //        Matcher m = p.matcher(textFile.readLine());

  //          while (m.find()) {
  //              writer.write(m.group() + " ");
  //          }
        }
        textFile.close();
        writer.close();


    }
}
