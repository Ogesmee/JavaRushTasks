package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String a = reader.readLine();
        String b = reader.readLine();
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        System.out.println(name + " получает " + a + " через "+ b + " лет.");
    }
}
