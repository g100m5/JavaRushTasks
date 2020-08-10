package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    static {
        threads.add(new TrOne());
        threads.add(new TrTwo());
        threads.add(new TrTree());
        threads.add(new TrFour());
        threads.add(new TrFive());
    }

    public static class TrOne extends Thread {

        public void run() {

            while (true) {
            }
        }
    }

    public static class TrTwo extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class TrTree extends Thread {

        @Override
        public void run() {

            while (true) {

                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        }
    }

    public static class TrFour extends Thread implements Message {
        public boolean isRun = false;

        public void run() {
            while (!isRun) {
            }
        }

        @Override
        public void showWarning() {
            isRun = true;
        }
    }

    public static class TrFive extends Thread {
        Scanner scan = new Scanner(System.in);

        @Override
        public void run() {
            int sum = 0;
            while (true) {
                String str = scan.nextLine();
                if (str.equals("N"))
                    break;
                sum += Integer.parseInt(str);
            }

            System.out.println(sum);

        }
    }


}


