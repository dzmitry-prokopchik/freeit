package com.prokopchik.homework3;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class homeworkTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        if ((n > 99 & n < 1000) | (n > -1000 & n < -99)) {
            System.out.println("Число " + n + " является трехзначным");
        } else {
            System.out.println("Число " + n + " не является трехзначным");
        }

        if ((n % 10 == 7) | (n == 7)) {
            System.out.println("Последняя цифра числа " + n + " является семеркой");
        } else {
            System.out.println("Последняя цифра числа " + n + " не является семеркой");
        }

        if (n % 2 == 0) {
            System.out.println("Число " + n + " является четным");
        } else {
            System.out.println("Число " + n + " не является четным");
        }
    }
}