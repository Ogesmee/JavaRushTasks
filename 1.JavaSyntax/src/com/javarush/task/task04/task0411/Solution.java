package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        if (month <= 2 ){
            System.out.println("зима");
        }
        if (month < 13 && month > 11){
            System.out.println("зима");
        }
        if (month <= 5 && month > 2){
            System.out.println("весна");
        }
        if (month <= 8 && month > 5){
            System.out.println("лето");
        }
        if (month <= 11 && month > 8){
            System.out.println("осень");
        }

    }
}