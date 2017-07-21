package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top){
        this.top = top ;
        width = 0;
        this.left = left;
        height = 0;
    }
    public void initialize(int left){
        top = 3 ;
        width = height;
        this.left = left;
        height = 0;
    }
    public void initialize(){
        top = 2;
        left = 4;
        width = 1;
        height = 5;
    }


    public static void main(String[] args) {

    }
}
