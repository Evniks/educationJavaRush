package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
    return 60 * 60 * hour;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.print(convertToSeconds(5));
    }
}
//1 час = 60 мин.
//1 мин = 60 сек.