/*
Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
При каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold" в зависимости от того, как далеко буква пользователя от загаданной
 */

package part_1.src.com.prokopchik.homework4;

import java.util.Random;
import java.util.Scanner;

public class gameGuessTheLetter {
    public static void main(String[] args) {

        //character=number. according to ASCII table a=97...z=122
        //generating random character(number) in range of 97 to 122
        Random rand = new Random();
        int randomChar = rand.nextInt(26) + 97;

        Scanner scanner = new Scanner(System.in);

        //game logic
        //cold=(randomChar-4), chilly=(randomChar-3), warmly=(randomChar-2), hot=(randomChar-1) , win=randomChar, hot=(randomChar+1), etc...

        int charFromUser;
        for (int attempts = 7; attempts >= 0; attempts--) {
            if (attempts == 0) {
                System.out.println("You have no more attempts!");
                System.out.println("=== YOU LOST! ===");
                break;
            }
            System.out.println("You have "+ attempts+" attempts!");
            System.out.println("Enter a LOWERCASE character");
            charFromUser = scanner.next().charAt(0);

            if (charFromUser == randomChar) {
                System.out.println("Correct, random character was " + (char) randomChar + "!");
                System.out.println("=== YOU WIN! ===");
                break;
            }
            if (charFromUser == randomChar - 1 | charFromUser == randomChar + 1) {
                System.out.println("HOT!");
            }
            if (charFromUser == randomChar - 2 | charFromUser == randomChar + 2) {
                System.out.println("WARMLY!");
            }
            if (charFromUser == randomChar - 3 | charFromUser == randomChar + 3) {
                System.out.println("CHILLY!");
            }
            if (charFromUser <= randomChar - 4 | charFromUser >= randomChar + 4) {
                System.out.println("COLD!");
            }
        }


    }
}
