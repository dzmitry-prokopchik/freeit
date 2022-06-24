package com.prokopchik.homework4;

//Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

import java.util.Scanner;

public class homeworkTask11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type NATURAL number here");
        int numberFromUser = scanner.nextInt();

        // Простое число делится без остатка на себя и на единицу. Не-простое тоже делится на себя и на единицу - значит, это не критерий отбора простых чисел
        // и эти итерации можно пропустить...  фигня ...единицу нужно оставить, чтобы дойдя до нее в цикле стало ясно, что число простое.
        // Как только в цикле остаток от деления будет 0, значит число не простое и можно завершить цикл при помощи break

        int counter = numberFromUser;

        while (counter > 1) {
            if ((counter == numberFromUser)) {
                counter--;
                continue;
            } else {
                int remainder = numberFromUser % counter;
                counter--;
                if (remainder == 0) {
                    System.out.println("This is NOT PRIME number!");
                    break;
                }
                if (counter == 1) {
                    System.out.println("This is PRIME number!");
                }
            }
        }

    }
}
