package com.company;

import jdk.nashorn.internal.objects.Global;

import java.util.Date;

public class System {

    public static String in;
    private static Global out;

    public static void main(String[] args) {
        Date now = new Date(); // Lấy ra thời gian hiện tại
        System.out.println("Now is: " + now);
    }
}

