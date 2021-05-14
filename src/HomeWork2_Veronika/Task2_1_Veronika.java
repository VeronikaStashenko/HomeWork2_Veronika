package HomeWork2_Veronika;

import java.util.Scanner;
//1*. Вывести пирамиду из цифр. Размер вводится пользователем. Пирамида - фигура такого вида:
//        1 1 1 1 1
//        1 2 2 2 1
//        1 2 3 2 1
//        1 2 2 2 1
//        1 1 1 1 1

public class Task2_1_Veronika {
    public static void main(String[] args) {
        System.out.println("Введите размер пирамиды =");
        Scanner scannerN = new Scanner(System.in);
        int PyramidLength = scannerN.nextInt();

        int[][] array = new int[PyramidLength + 1][PyramidLength + 1];

        int middle;
        if (PyramidLength / 2 == 0) {
            middle = PyramidLength / 2;
        } else {
            middle = PyramidLength / 2 + 1;
        }
        for (int i = 1; i <= PyramidLength; i++) {
            for (int j = 1; j <= PyramidLength; j++) {
                array[i][j] = 0;
   //             System.out.print(array[i][j] + " ");
            }
   //         System.out.println(" ");
        }
        int begin = 1;
        int end = PyramidLength;
        for (int i = 1; i <= middle; i++) {
            for (int j = begin; j <= end; j++) {
                array[begin][j] = i;
            }
            for (int j = begin; j <= end; j++) {
                array[end][j] = i;
            }
            for (int j = begin; j <= end; j++) {
                array[j][begin] = i;
            }
            for (int j = begin; j <= end; j++) {
                array[j][end] = i;
            }
            begin = begin+1;
            end = end-1;

        }
        for (int i = 1; i <= PyramidLength ; i++) {
            for (int j = 1; j <=PyramidLength ; j++) {
                System.out.print( array [i][j]+" ");
            }
            System.out.println();

        }
    }


}

