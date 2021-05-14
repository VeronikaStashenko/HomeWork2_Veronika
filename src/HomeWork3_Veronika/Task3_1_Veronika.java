package HomeWork3_Veronika;
//11.8. Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел из диапазона -20..+35.
//        После каждого отрицательного числа следует вывести (вплотную к числу) символ«?» (знак вопроса).

import java.util.Random;

public class Task3_1_Veronika {
    public static void main(String[] args) {
        Random RANDOM = new Random();
        int number;
        int MAX_BOUND = 35;
        int MIN_BOUND = -20;
        for (int i = 0; i < 14; i++) {
            number = RANDOM.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
            if (Math.abs(number) % 2 == 1) {
                System.out.print(number + "? ");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}