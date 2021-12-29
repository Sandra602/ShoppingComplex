package com.mainprogram;

import Admin.Admin;

import java.util.Calendar;
import java.util.Scanner;

public class ShoppingComplex {

    //STATIC METHOD
    static void shopAddress() {
        System.out.println("Kiliyanthara, Kunnoth");
    }

    public static void main(String[] args) {
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "June",
                "July",
                "Aug",
                "Sept",
                "Oct",
                "Nov",
                "Dec"
        };


        boolean count = true;
        Calendar calendar = Calendar.getInstance();
        System.out.println("*******************************************************");
        System.out.println("                       WELCOME                         ");
        System.out.println("*******************************************************");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println();
        shopAddress();


        while (count) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("1. Admin Login" + "\t" + "2. Staff Login" + "\t" + "3. Customer Login");
            int option = input1.nextInt();

            //User obj = new UserValue();
            //obj.run();
            //obj.userinsert();

            if (option == 1) {
                Admin.adminsnames();
                //Staff xyz = new Staff();
                //xyz.new_staff();
                Admin zxc = new Admin();
                zxc.transactions();
            }
        }
    }
}