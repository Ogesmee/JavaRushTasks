package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrBig = new int[20];


        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr_1 = new int[10];
        int[] arr_2 = new int[10];

        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = arrBig[i];

        }

        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = arrBig[i + arr_1.length];
            System.out.println(arr_2[i]);
        }
    }
}
