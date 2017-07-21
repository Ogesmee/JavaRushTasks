package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name, address, color;
    private int age, weight;

    public void initialize(String name) {
        this.name = name;
        address = null;
        weight = 1;
        age = 2;
        color = "black";

    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "pink";
        address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 1;
        color = "green";
        address = null;

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = null;
        age = 2;
        address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        name = null;
        age = 3;
    }


    public static void main(String[] args) {

    }
}
