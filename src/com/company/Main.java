package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60L;
            long days = hours / 24L;
            long years = days / 365L;

            if (years % 365L > 0) {
                days = days % 365L;
            }

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
