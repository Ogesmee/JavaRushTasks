package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x) {
        this.x = x;
        y = 2;
        radius = 10;
    }
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        radius = 5;
    }
    public Circle(){this(2,2,4);}

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}