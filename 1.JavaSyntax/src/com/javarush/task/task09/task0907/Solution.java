package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        try {



        int a = 42 / 0;

        } catch (ArithmeticException e) {

            System.out.println(e.toString());

        }

        //напишите тут ваш код
    }
}