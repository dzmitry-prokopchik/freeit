package part_1.src.com.prokopchik.homework4;

import java.util.Scanner;

public class homeworkTask11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type NATURAL number here");
        int numberFromUser = scanner.nextInt();

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
