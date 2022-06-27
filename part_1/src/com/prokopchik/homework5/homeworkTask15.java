package part_1.src.com.prokopchik.homework5;

/*Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
и снова распечатать (при переворачивании нежелательно создавать еще один массив).*/

import java.util.Random;

public class homeworkTask15 {
    public static void main(String[] args){
        Random rand = new Random();
        int arrayLength = rand.nextInt(15) + 8;

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) - 100;
            System.out.print(array[i] + " ");
        }

        int firstReplaced = 0;
        int secondReplaced = 0;
        for (int i = 0; i < (array.length / 2) + 1; i++) {
            if (array.length % 2 == 0 & i == array.length / 2) {
                break;
            }
            firstReplaced = array[i];
            secondReplaced = array[array.length - 1 - i];
            array[i] = secondReplaced;
            array[array.length - 1 - i] = firstReplaced;
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

