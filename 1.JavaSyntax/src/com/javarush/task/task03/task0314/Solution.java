package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10){
            a++;
            int b = 1;
            int c;
            while (b < 11){
                c = a *b;
                System.out.print(c + " ");
                b++;
            }
            System.out.println(); //перенос строки аргументом  a в первом цикле
        }

    }
}
