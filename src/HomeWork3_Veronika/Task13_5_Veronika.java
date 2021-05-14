package HomeWork3_Veronika;

import java.util.Scanner;

//13.5. Назовем «базой» положительного числа Х сумму всех положительных целых чисел, меньших Х. Напишите класс,
//        который принимает с клавиатуры положительное целое число Х и подсчитывает его «базу».
public class Task13_5_Veronika {
    public static void main(String[] args) {
        System.out.println("Введите положительное число - ");
        Scanner scsnner = new Scanner(System.in);
        int number = scsnner.nextInt();
        int base = 0;
        for (int i = 1; i < number; i++) {
            base = base + i;
        }
        System.out.println("База числа " + number + " = " + base);
    }
}
