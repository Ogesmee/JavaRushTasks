package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(reader.readLine());

        if (((year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)) { //(если год делится на 4 и НЕ делится на 100) или год делится на 400
            int x = 366;
            System.out.println("количество дней в году: "+ x);
        }
        else {
            int x = 365;
            System.out.println("количество дней в году: "+ x);
        }
    }
}
