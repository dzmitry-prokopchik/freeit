package part_1.src.com.prokopchik.homework4;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class homeworkTask12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number here");
        int numberFromUser = scanner.nextInt();

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
