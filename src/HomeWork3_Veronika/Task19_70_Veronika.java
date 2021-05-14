package HomeWork3_Veronika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19_70_Veronika {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Введите размер массива : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength + 1];
        int MAX_BOUND = arrayLength;
        int MIN_BOUND = 1;
        int number;

        for (int i = 1; i <= arrayLength; i++) {

            number = random.nextInt((MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);
            array[i] = number;
        }
        for (int i = 1; i <= arrayLength; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.print("\n");
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arrayLength; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int j = 1; j <= arrayLength; j++) {
            System.out.print(array[j] + " ");

        }
        int flag = 0;
        for (int i = 2; i < arrayLength; i++) {
            if ((array[i] == array[i - 1]) || (array[1] == 0)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Полный");
        } else {
            System.out.println("Не является полным");

        }

    }
}