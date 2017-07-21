package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = 0;
        if ((a > 0 && b < 0 && c < 0) || (a < 0 && b > 0 && c < 0) || (a < 0 && b < 0 && c > 0)){
            x = 1;
            System.out.println(x);
        }
        else if ((a > 0 && b > 0 && c < 0) || (a < 0 && b > 0 && c > 0 ) || (a > 0 && b < 0 && c > 0)){
            x = 2;
            System.out.println(x);
        }
        else  if (a > 0 && b > 0 && c > 0){
            x = 3;
            System.out.println(x);
        }
        else if (a < 0 && b < 0 && c < 0){
            x = 0;
            System.out.println(x);
        }

    }
}
