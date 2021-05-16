package HomeWork4_Veronika;

import java.util.Random;
import java.util.Scanner;

//1. Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
//        разделённых пробелами (1 способ - String).
public class Task4_1_Veronika {
    public static void main(String[] args) {
        Random random = new Random();
        String str = "";
        int namber;
        for (int i = 0; i < 100; i++) {
            namber = random.nextInt(1000);
            str = str + " " + namber;
        }
        System.out.println(str);
    }
}
