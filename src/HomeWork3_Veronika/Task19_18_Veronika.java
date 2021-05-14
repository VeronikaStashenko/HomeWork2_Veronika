package HomeWork3_Veronika;
//19.18. Заполнить массив положительными случайными двузначными числами так,
//        чтобы они образовывали неубывающую последовательность
//        (каждый элемент не меньше предыдущего).
import java.util.Random;
import java.util.Scanner;

public class Task19_18_Veronika {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Введите размер массива : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength + 1];
        int MAX_BOUND = 99;
        int MIN_BOUND = 10;
        int number;
        number = random.nextInt((MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);
        array[1] = number;

        int i = 2;
        while (i <= arrayLength) {

            number = random.nextInt((MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);

            if (array[i - 1] < number) {
                array[i] = number;
                i++;
            }

        }
        for (int j = 1; j <= arrayLength; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
