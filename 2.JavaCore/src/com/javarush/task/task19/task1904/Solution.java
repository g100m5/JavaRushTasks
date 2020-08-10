package com.javarush.task.task19.task1904;

import sun.util.calendar.BaseCalendar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws ParseException {


        String str = "Иванов Иван Иванович 31 12 1950";

        String []ar1 = str.split(" ");

        Date date1 = new SimpleDateFormat("dd MM yyyy").parse(ar1[3] + " " + ar1[4] + " " + ar1[5]);


        Person p1 = new Person(ar1[1], ar1[2], ar1[0], date1 );

        //System.out.println(date1);
        System.out.println(p1.toString());





   }

    public static class PersonScannerAdapter implements PersonScanner {


        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {this.fileScanner = fileScanner;}

        @Override
        public Person read() throws IOException, ParseException {


            String line =  fileScanner.nextLine();
            String[]arr =  line.split("\\s",4);

            Date date = new SimpleDateFormat("dd M y", Locale.ENGLISH).parse(arr[3]);


            return new Person(arr[1],arr[2],arr[0],date);




            //return new Person(fileScanner.toString(String lastName, String firstName, middleName, birthDate, ));
        }

        @Override
        public void close() throws IOException {

            fileScanner.close();

        }
    }
}
