package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int result = 0;
        while (!(s = reader.readLine()).equals("сумма")){
            result += Integer.valueOf(s);
        }
        System.out.println(result);
    }
}
