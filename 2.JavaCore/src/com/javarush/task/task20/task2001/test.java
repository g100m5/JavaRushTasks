package com.javarush.task.task20.task2001;
import java.util.Scanner;
public class test {
    



public static boolean isPalindrome(String word) {

        word = word.toLowerCase();
        boolean result = false;
        int x = word.length() / 2;
        System.out.println(x);
        for(int y = 1; y <= x; y++  ) {

                if (word.charAt(y - 1) != word.charAt(word.length() - y)) {
//                        System.out.println("test");
                        break;

                }

                result = true;
        }




        return result;
        }
public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(isPalindrome(word));
        }



}