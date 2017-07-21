package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        age = 2;
        weight = 3;
        color = "govno";
        address = null;
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "dark";
        address = null;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 3;
        color = "white";
        address = null;
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = null;
        age = 3;
        address = null;

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        name = null;
        age = 3;
    }


    public static void main(String[] args) {

    }
}
