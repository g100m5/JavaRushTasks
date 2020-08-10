package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {




        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String OldResult = outputStream.toString();
        String result = OldResult;
        int sum = 0;

        System.setOut(consoleStream);

       String firstValue = "";
       String secondValue = "";


        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(result);

        m.find();
        firstValue = m.group();

        result = result.replace(firstValue, "");

        m.find();
        secondValue = m.group();

        result = result.replace(secondValue, "");

        result = result.replace("=", "");

 //       System.out.print(result);

        result = result.replaceAll(" ", "");
        result = result.replaceAll("\\n", "");

        String operator = result;

   //     System.out.print(result + 1);

       // result = "+";
        if(operator.equals("+")) {
        //    System.out.println("hi");
           sum = Integer.parseInt(firstValue) + Integer.parseInt(secondValue);
        }

        if(result.equals("-")) {
            sum = Integer.parseInt(firstValue) - Integer.parseInt(secondValue);
        }

        if(result.equals("*")) {
            sum = Integer.parseInt(firstValue) * Integer.parseInt(secondValue);
        }

        result = OldResult + sum;



        //выводим ее в консоль
        System.out.println(result);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

