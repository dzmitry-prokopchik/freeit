package com.prokopchik.homework2;

/*Задание 3
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд
 */
public class homeworkTask3 {
    public static void main(String[] args) {

        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h % 24;
        int day = (h - d) / 24;
        int w = day % 7;
        int week = (day - w) / 7;
        System.out.println("A) " + m + " минут " + sec + " секунд");
        System.out.println("B) " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("C) " + day + " дней " + d + " часов " + min + " минут " + sec + " секунд");
        System.out.println("D) " + week + " недель " + w + " дней " + d + " часов " + min + " минут " + sec + " секунд");

    }
}