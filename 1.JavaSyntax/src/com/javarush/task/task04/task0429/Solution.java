package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        String s1 = "количество положительных чисел: ";
        String s2 = "количество отрицательных чисел: ";
        int x = 0, y = 0;

        if (a > 0){
            x++;
        }
        else if (a != 0){
            y++;}
        if (b > 0){
            x++;
        }
        else if (b != 0){
            y++;}
        if (c > 0){
            x++;
        }
        else if (c !=0){
            y++;
        }
        System.out.println(s1 + x);
        System.out.println(s2 + y);
    }
}

