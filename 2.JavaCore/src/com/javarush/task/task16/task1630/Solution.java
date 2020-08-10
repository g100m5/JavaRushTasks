package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        Scanner scan = new Scanner(System.in);
        firstFileName = scan.nextLine();
        secondFileName = scan.nextLine();
    }

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
                while (fileReader.ready()) {
                    content.add(fileReader.readLine());
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File "+filename+" not found");
            } catch (IOException e) {
                System.out.println("File "+filename+" can't read");
            }

        }

        String filename = "";
        List<String> content;

        public ReadFileThread() {
            this.filename = null;
            this.content = new ArrayList<>();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        @Override
        public String getFileContent()  {
            StringBuffer str1 = new StringBuffer();
            for (String s : content) {
                str1.append(s).append(" ");
            }
            return str1.toString();
        }
    }
    //add your code here - добавьте код тут
}
