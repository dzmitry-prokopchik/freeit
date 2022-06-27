package com.prokopchik.homework3;

/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        полностью закрыть круглой картонкой радиусом r.*/

import java.util.Scanner;

public class homeworkTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отверстия");
        int a = scanner.nextInt();
        System.out.println("Введите ширину отверстия");
        int b = scanner.nextInt();
        System.out.println("Введите радиус картонки");
        int r = scanner.nextInt();

        int diag = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        int diagHalf = diag / 2;

        if (diagHalf <= r) {
            System.out.println("Закроет полностью!");
        } else {
            System.out.println("Не получится закрыть!");
        }
    }
}