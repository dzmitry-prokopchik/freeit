package com.prokopchik.homework4;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.

public class homeworkTask12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number here");
        int numberFromUser = scanner.nextInt();

        // надо проверять делится ли число на 3, начать нужно с единицы, т.к. мы  проверяем натуральные числа
        // если число делится на 3 - прибавляю его к переменной, где у меня хранится сумма чисел и вычитаю единицу  из numberFromUser

        int sumOfDevidibleNumbers = 0;
        int nextNumber = 0;
        while (numberFromUser >= 0) {
            if (nextNumber % 3 == 0) {
                sumOfDevidibleNumbers += nextNumber;
                numberFromUser--;
            }
            nextNumber++;
        }
        System.out.println(sumOfDevidibleNumbers);
    }
}