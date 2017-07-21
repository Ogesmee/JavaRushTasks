package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        int i = 0;
        for (; true;){
            float a = Integer.parseInt(reader.readLine());
            if (a != -1){
                sum += a;
                i++;
            }
            else if (a == -1){
                System.out.println(sum/i);
                break;
            }
        }
    }
}

