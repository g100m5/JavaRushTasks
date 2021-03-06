package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netaddress = new byte[]{ (byte) (ip[0] & mask[0]), (byte) (ip[1] & mask[1]),
                (byte) (ip[2] & mask[2]), (byte) (ip[3] & mask[3])} ;



        return netaddress;
    }

    public static void print(byte[] bytes) {

        System.out.print(Integer.toBinaryString((bytes[0] & 0xFF) + 0x100).substring(1));
        System.out.print(" ");
        System.out.print(Integer.toBinaryString((bytes[1] & 0xFF) + 0x100).substring(1));
        System.out.print(" ");
        System.out.print(Integer.toBinaryString((bytes[2] & 0xFF) + 0x100).substring(1));
        System.out.print(" ");
        System.out.println(Integer.toBinaryString((bytes[3] & 0xFF) + 0x100).substring(1));



    }
}
