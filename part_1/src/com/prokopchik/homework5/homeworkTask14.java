package part_1.src.com.prokopchik.homework5;

//Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера

import java.util.Random;

public class homeworkTask14 {
    public static void main(String[] args) {
        int[] arrayOfMarks = new int[15];

        Random rand = new Random();

        //заполню массив случайными числами-оценками от 1 до 10
        for (int i = 0; i < arrayOfMarks.length; i++) {
            arrayOfMarks[i] = rand.nextInt(10) + 1;
            System.out.print(arrayOfMarks[i] + " ");
        }

        //ищу максимальную и минимальную оценки в массиве
        int maximumMark = 0;
        int minimumMark = 0;
        for (int i = 0; i < arrayOfMarks.length; i++) {
            if (i == 0) {
                maximumMark = arrayOfMarks[i];
                minimumMark = arrayOfMarks[i];
            }
            if (arrayOfMarks[i] > maximumMark) {
                maximumMark = arrayOfMarks[i];
            }
            if (arrayOfMarks[i] < minimumMark) {
                minimumMark = arrayOfMarks[i];
            }
        }
        System.out.println("\nMaximum mark is " + maximumMark);
        System.out.println("Minimum mark is " + minimumMark);

        //узнаю, сколько раз повторяются максимальная и минимальная оценки
        int maximumMarkFrequency = 0;
        int minimumMarkFrequency = 0;
        for (int i = 0; i < arrayOfMarks.length; i++) {
            if (arrayOfMarks[i] == maximumMark) {
                maximumMarkFrequency++;
            }
            if (arrayOfMarks[i] == minimumMark) {
                minimumMarkFrequency++;
            }
        }
        System.out.println("Maximum mark is found " + maximumMarkFrequency + " times");
        System.out.println("Minimum mark is found " + minimumMarkFrequency + " times");

        //теперь надо создать массивы чисел, в которых будут храниться индексы максимальных и минимальных оценок
        int[] maximumMarkIndex = new int[maximumMarkFrequency];
        int[] minimumMarkIndex = new int[minimumMarkFrequency];
        int maximumMarkCounter = 0;
        int minimumMarkCounter = 0;
        System.out.print("Maximum mark(s) index(es) is(are): ");
        for (int i = 0; i < arrayOfMarks.length; i++) {
            if (arrayOfMarks[i] == maximumMark) {
                maximumMarkIndex[maximumMarkCounter] = i;
                System.out.print(i + " ");
                maximumMarkCounter++;
            }
        }
        System.out.print("\nMinimum mark(s) index(es) is(are): ");
        for (int i = 0; i < arrayOfMarks.length; i++) {
            if (arrayOfMarks[i] == minimumMark) {
                minimumMarkIndex[minimumMarkCounter] = i;
                System.out.print(i + " ");
                minimumMarkCounter++;
            }

        }
    }
}

