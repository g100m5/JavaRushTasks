package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
////            System.out.println("How can I help you?");
//            String str = scanner.nextLine();
//
//
//            String[] keys = str.split(" ");


            switch (args[0]) {
                case "-c": {
                    addPerson(args);
                    break;
                }
                case "-u":
                    updatePerson(args);
                    break;
                case "-d":
                    deletePerson(args);
                    break;
                case "-i":
                    infoPerson(args);
                    break;
            default:
                throw new IllegalArgumentException("Wrong key type or something else:" + args.toString());
        }

        }


    public static void addPerson(String[] string) throws ParseException {
        //-c name sex bd

        Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(string[3]);

        if (string[2].toLowerCase().equals("м"))
        { allPeople.add(Person.createMale(string[1], bd)); }

        if (string[2].toLowerCase().equals("ж"))
        { allPeople.add(Person.createFemale(string[1], bd)); }

        System.out.println(allPeople.size() - 1);

    }

    public static void updatePerson(String[] string) throws ParseException {
        //-u id name sex bd
        int id = Integer.parseInt(string[1]);
        Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(string[4]);
        Sex sexPerson = null;

        if (string[3].toLowerCase().equals("м")) {
            sexPerson = Sex.MALE;
        }

        if (string[3].toLowerCase().equals("ж")) {
            sexPerson = Sex.FEMALE;
        }

        allPeople.get( id ).setName(string[2]);
        allPeople.get( id ).setSex(sexPerson);
        allPeople.get( id ).setBirthDate(bd);
    }

    public static void deletePerson(String[] string) {
        int id = Integer.parseInt(string[1]);

        allPeople.get( id ).setName(null) ;
        allPeople.get( id ).setSex(null);
        allPeople.get( id ).setBirthDate(null);

    }

    public static void infoPerson(String[] string) {
        //Миронов м 15-Apr-1990

        int id = Integer.parseInt(string[1]);

        String sexPerson = "м";

        if (allPeople.get(id).getSex().equals(Sex.FEMALE)) {
            sexPerson = "ж";
        }

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = allPeople.get(id).getBirthDate();
        sdf.applyPattern("dd-MMM-yyyy");


        System.out.print(allPeople.get(id).getName());
        System.out.print(" ");


        System.out.print(sexPerson);
        System.out.print(" ");
        if (date != null) {
            System.out.println(sdf.format(date));
        }
        else { System.out.println(date); }

    }


}
