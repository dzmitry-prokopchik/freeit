package part_1.src.com.prokopchik.homework5;

import java.util.Random;

//Создать последовательность случайных чисел, найти и вывести наибольшее из них.
public class homeworkTask13 {
    public static void main(String[] args) {

        //создаю массив рандомой длины
        Random rand = new Random();
        int randomArrayLength = rand.nextInt(20) + 1;
        int[] arrayOfRandomNumbers = new int[randomArrayLength];

        // заполняю массив рандомными числами от 1 до 100
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = rand.nextInt(100) + 1;
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }

        // ищу максимальный элемент в массиве и вывожу его
        int maxNumber = 0;
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (i == 0) {
                maxNumber = arrayOfRandomNumbers[i];
            } if (arrayOfRandomNumbers[i] >= maxNumber) {
                maxNumber = arrayOfRandomNumbers[i];
            }
        }
        System.out.println("\nMax number is " + maxNumber);
    }
}