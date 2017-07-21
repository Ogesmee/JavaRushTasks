package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        int[] list = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            list[i] = s.length();
            System.out.println(list[i]);
        }
    }
}
