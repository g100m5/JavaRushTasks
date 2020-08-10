package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        reader.close();

        BufferedReader textFile = new BufferedReader(new FileReader(sourceFileName));
        BufferedWriter writer = new BufferedWriter (new FileWriter(destinationFileName));

        while (textFile.ready()) {

            writer.write(textFile.readLine().replaceAll("\\p{Punct}",""));

        }
        textFile.close();
        writer.close();


    }
}
