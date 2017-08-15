package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1, n = 1;// n- горизонтальные, i- вертикальные. 
        while(i<=10) //
        {   //цикл 1 начало
            
            System.out.print(i +" ");
            while(n<=9) //этот цикц будет повторяться пока n не будет =10 
            {  //(цикл 2 начало)
                n++;
                System.out.print(i * n +" ");
            }  // (цикл 2 конец)
            
            i++; //когда цикл 2,заканчивается i = i + 1 ,и цикл 2 начинается заново.
            n = 1; //мы заново переменной присваеваем значение = 1.
            
            System.out.println("");
        }   //цикл 1 конец
    }
}
