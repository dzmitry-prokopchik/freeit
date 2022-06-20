package com.prokopchik.homework2;

public class homeworkTask4 {

    /*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
    public static void main(String[] args){
        int n = 5432;

        int x4 = n / 1000;
        int x3 = (n - x4 * 1000) / 100;
        int x2 = (n - x4 * 1000 - x3 * 100) / 10;
        int x1 = n % 10;

        int newInt = (x1 * 1000) + (x2 * 100) + (x3 * 10) + x4;

        System.out.println(newInt);

    }
}
