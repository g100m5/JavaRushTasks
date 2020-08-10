package com.javarush.task.task21.task2106;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        long temp = 100;

        Double aDouble = 11.0;

        System.out.println(10 ^ 100 );

        System.out.println((temp ^ (temp >>> 3)));

        System.out.println(Double.doubleToLongBits(10)  ^   Double.doubleToLongBits(10) >>> 32);
        System.out.println(Double.doubleToLongBits(12));

        System.out.println(Double.doubleToLongBits(10) >>> 32);
        System.out.println(Double.doubleToLongBits(10) >>> 32);
        System.out.println(Double.doubleToLongBits(12) >>> 32);



        temp = aDouble == +0.0d ? Double.doubleToLongBits(aDouble) : 10L;

        System.out.println(temp);
    }

    public test() {

    }
}
