package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
//            System.out.println("How can I help you?");
//            String str = scanner.nextLine();
//
//
//        String[] keys = str.split(" ");
//

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    addPerson(args);

                break;
                }
            }
            case "-u":
                synchronized (allPeople) {
                    updatePerson(args);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    deletePerson(args);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    infoPerson(args);
                    break;
                }
            default:
                throw new IllegalArgumentException("Wrong key type or something else:" + args.toString());
        }

    }

//}

    public static void addPerson(String[] string) throws ParseException {
        //-c name sex bd

        for (int z = 1; z <= string.length - 1; z+=3 ) {

            Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(string[z + 2]);


                if (string[z + 1].toLowerCase().equals("м")) {
                        allPeople.add(Person.createMale(string[z], bd));
                    }

                if (string[z + 1].toLowerCase().equals("ж")) {
                        allPeople.add(Person.createFemale(string[z], bd));

                }

                    System.out.println(allPeople.size() - 1);
            }
        }



    public static void updatePerson(String[] string) throws ParseException {
        //-u id name sex bd
        //-u 0 ttt м 11/12/2001 1 tty ж 13/10/1988

        for (int z = 1; z <= string.length - 1; z+=4 ) {

            int id = Integer.parseInt(string[z]);
            Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(string[z + 3]);
            Sex sexPerson = null;

            if (string[z + 2].toLowerCase().equals("м")) {
                sexPerson = Sex.MALE;
            }

            if (string[z + 2].toLowerCase().equals("ж")) {
                sexPerson = Sex.FEMALE;
            }
                allPeople.get(id).setName(string[z + 1]);
                allPeople.get(id).setSex(sexPerson);
                allPeople.get(id).setBirthDate(bd);
        }
    }

    public static void deletePerson(String[] string) {

        for (int z = 1; z <= string.length - 1; z++ ) {
            int id = Integer.parseInt(string[z]);
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);

        }

    }

    public static void infoPerson(String[] string) {
        //Миронов м 15-Apr-1990



        for (int z = 1; z <= string.length - 1; z++ ){

            int id = Integer.parseInt(string[z]);

            String sexPerson = null;

            SimpleDateFormat sdf = new SimpleDateFormat();

            Date date = new Date();
            Sex sex = null;
            String name = "";

                name = allPeople.get(id).getName();
                sex = allPeople.get(id).getSex();
                date = allPeople.get(id).getBirthDate();


            sdf.applyPattern("dd-MMM-yyyy");




            if(sex != null) {
                if (sex.equals(Sex.FEMALE)) {
                    sexPerson = "ж";
                }

                if (sex.equals(Sex.MALE)) {
                    sexPerson = "м";
                }
            }


            System.out.print(name);
            System.out.print(" ");


            System.out.print(sexPerson);
            System.out.print(" ");
            if (date != null) {
                System.out.println(sdf.format(date));
            } else {
                System.out.println(date);
            }
        }

    }
}
