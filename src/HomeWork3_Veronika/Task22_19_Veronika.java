package HomeWork3_Veronika;

import java.util.Random;
import java.util.Scanner;

public class Task22_19_Veronika {
    public static void main(String[] args) {
        System.out.println("Введите размер массива =");
        Scanner scannerN = new Scanner(System.in);
        int Length = scannerN.nextInt();

        int[][] array = new int[Length][Length];
        Random random = new Random();
        int MAX_BOUND = 99;
        int MIN_BOUND = 20;
        int number;


        for (int i = 0; i <= Length-1; i++) {
            for (int j = 0; j <= Length-1; j++) {
                number = random.nextInt((MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);
                array[i][j] = number;
            }

        }

        for (int i = 0; i <= Length-1; i++) {
            for (int j = 0; j <= Length-1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int SumDiagonal = 0;
        for (int i = 0; i < Length-1; i++) {
            SumDiagonal = SumDiagonal + array [i][i];

        }
        System.out.println("Сумма элементов диагонали = "+SumDiagonal);
    }
}
