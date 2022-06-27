package com.prokopchik.homework2;

import java.util.Scanner;
/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?*/
public class homeworkTask5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4-хзначное натуральное чмсло");
        int n = scanner.nextInt();

        int x4 = n / 1000;
        int x3 = (n - x4 * 1000) / 100;
        int x2 = (n - x4 * 1000 - x3 * 100) / 10;
        int x1 = n % 10;

        System.out.print("Все цифры числа различны: " + ((x1 != x2) & (x1 != x3) & (x1 != x4) & (x2 != x3) & (x2 != x4) & (x3 != x4)));

    }
}