package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        reader.close();


        FileReader reader1 = new FileReader(sourceFileName);
        FileWriter writer = new FileWriter(destinationFileName);

        int counter = 1;

        while (reader1.ready()) //пока есть непрочитанные байты в потоке ввода
        {

            int data = reader1.read(); //читаем один символ (char будет расширен до int)
          //  System.out.println(data);
            if (counter %2 == 0) {
                writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
            }

            counter++;

        }

        //закрываем потоки после использования
        reader1.close();
        writer.close();
    }
}
