package part_1.src.com.prokopchik.homework4;

public class homeworkTask10 {
    //Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
    //Факториал числа — это произведение натуральных чисел от 1 до самого числа (включая данное число).
    public static void main(String[] args) {
       /* факториал 10
        long factorial = 1;
        int number = 10;
        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        */


        int numberOuter = 10;
        for (int i = 10; i <= 15; i++) {
            long factorial = 1;
            int numberInner = numberOuter;
            for (int j = numberInner; j > 1; j--) {
                factorial *= j;
            }
            System.out.println("Факториал числа "+ numberOuter + " равен " + factorial);
            numberOuter++;
        }
    }
}