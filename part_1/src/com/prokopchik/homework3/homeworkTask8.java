package com.prokopchik.homework3;

/*Имеется целове число (задать с помощью Random rand = new Random(); int x =rand.nextInt() ).
Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class homeworkTask8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int y = x % 10;

        //0-5-6-7-8-9 -  рублей
        // 1 - рубль
        // 2-3-4 - рубля
        switch (y) {
            case 1 -> System.out.println(x + " рубль");
            case 2, 3, 4 -> System.out.println(x + " рубля");
            default -> System.out.println(x + " рублей");
        }
        ;
    }
}
