package com.company;

public class Main{

    int miles = toMilesPerHour(14);
    System.out.println(miles);

    public static int toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        int rounded = (int) Math.round(kilometersPerHour/1.609)
        return rounded;
    }
}