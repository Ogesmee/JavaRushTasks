package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "S";
        int x = 0;
        while (x < 10){
            int y = 0;
            while (y < 10){
                System.out.print(s);
                y++;
            }
            System.out.println();
            x++;
        }

    }
}
