package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man Andy = new Man("Andy", 23, "Moscow sity");
        Man John = new Man("John", 28, "Chelyabinsk sity");
        System.out.println(Andy.name + " " + Andy.age + " " + Andy.address);
        System.out.println(John.name + " " + John.age + " " + John.address);
        //////////////////////////////////////////////////////////////////////////////
        Woman Dinara = new Woman("Dinara", 28, "Chelyabinsk sity");
        Woman Lily = new Woman("Lily", 33, "New York sity");
        System.out.println(Dinara.name + " " + Dinara.age + " " + Dinara.address);
        System.out.println(Lily.name + " " + Lily.age + " " + Lily.address);
    }

    public static class Man {
        String name;
        String address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        String address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
