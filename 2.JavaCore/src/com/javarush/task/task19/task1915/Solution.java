package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {


        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString();
        System.out.println(result);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(outputStream.toByteArray());
        fileOutputStream.close();
        read.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

