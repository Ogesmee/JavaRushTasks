package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        a = ab*ab;
        System.out.println(a);

    }
}