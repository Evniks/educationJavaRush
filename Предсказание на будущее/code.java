package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String zp = reader.readLine();
        String god = reader.readLine();
        int nzp = Integer.parseInt(zp);
        int vgod = Integer.parseInt(god);
        System.out.print(name + " получает " + nzp + " через " + vgod + " лет.");
    }
}
