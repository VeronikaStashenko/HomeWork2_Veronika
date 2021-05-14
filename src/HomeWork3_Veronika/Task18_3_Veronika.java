package HomeWork3_Veronika;
//18.13. Напишите класс, который заполняет случайными четырехзначными числами массив,
//        размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива в одной строке,
//        начиная с «конца» массива (с последней ячейки).
import java.util.Random;
import java.util.Scanner;

public class Task18_3_Veronika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива = ");
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];

        int MAX_BOUND = 9999;
        int MIN_BOUND = 1000;
        int number;
        System.out.println("Исходный массив :");
        for (int i = 0; i <= arrayLength - 1; i++) {
            number = random.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
            array[i] = number;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке :");
        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
