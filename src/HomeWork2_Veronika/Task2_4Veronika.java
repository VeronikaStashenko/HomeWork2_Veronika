package HomeWork2_Veronika;

import java.util.Scanner;

//4 (3 балла). Пользователь вводит число в небольшом диапазоне (от 0 до 100).
//        Программа должна угадать, что это за число и продемонстрировать количество попыток,
//        которое потребовалось для угадывания.
public class Task2_4Veronika {
    public static void main(String[] args) {
        System.out.println("Введите число в диапозоне от 0 до 100 ");
        Scanner scanner1 = new Scanner(System.in);
        int namber = scanner1.nextInt();
        int attempts = 1;
        int numberComputer = 50;
        int numberBoderLeft = 0;
        int numberBoderRight = 100;
        while (namber != numberComputer) {
            if (numberComputer > namber) {
                numberBoderRight = numberComputer;
                numberComputer = numberBoderRight - (numberBoderRight - numberBoderLeft) / 2;
                attempts = attempts + 1;
                System.out.println(numberComputer);
            } else {
                numberBoderLeft = numberComputer;
                numberComputer = numberBoderLeft + (numberBoderRight - numberBoderLeft) / 2;
                attempts = attempts +1;
                System.out.println(numberComputer);
            }
        }
        if (attempts == 1) {
            System.out.println(" Ваше число 50, угадал Компьютер с первой попытки");
        }
        else  {
            System.out.println("Ваше число " + numberComputer + " угадал Компьютер с " + attempts + " попытки.");
        }
    }
}
