package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {

    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

    }


    public static void main(String[] args) {


        String callto = "+38(050)123-45-67";
        callto = callto.replace("(","");
        callto = callto.replace(")","");
        callto = callto.replace("-","");

        System.out.println(callto);


        String name = "Ivanov, Ivan";
        System.out.println(name.split(", ")[1]);
        System.out.println(name.split(", ")[0]);


        System.out.println(countries.get("Ukraine"));




    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;


        public DataAdapter(Customer customer, Contact contact) {

            this.customer = customer;
            this.contact = contact;

        }

        @Override
        public String getCountryCode() {

            String countryCode = "";

            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                    countryCode = entry.getKey();
                }
            }

            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {

            String callto = contact.getPhoneNumber();
            callto = callto.replace("(","");
            callto = callto.replace(")","");
            callto = callto.replace("-","");


            return "callto://" + callto;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}