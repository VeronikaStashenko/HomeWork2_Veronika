package HomeWork2_Veronika;

import java.util.Scanner;

//2 (2 балла). Пользователь вводит месяц и день (числа). Вывести, есть ли такой день в этом месяце.
public class Task2_2_Veronika {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца =");
        Scanner scanner1 = new Scanner(System.in);
        int nambermonth = scanner1.nextInt();
        System.out.println("Введите номер дня =");
        Scanner scanner2 = new Scanner(System.in);
        int namberday = scanner2.nextInt();
        if ((nambermonth == 1) || (nambermonth == 3) || (nambermonth == 5)
                || (nambermonth == 7) || (nambermonth == 8) || (nambermonth == 10) || (nambermonth == 12)) {
            if ((namberday >= 1) && (namberday <= 31)) {
                System.out.println("В этом месяце есть такой день");
            } else {
                System.out.println("В этом месяце нет такого дня");
            }
        } else {
            if (nambermonth == 2) {
                if ((namberday >= 1) && (namberday <= 28)) {
                    System.out.println("В этом месяце есть такой день");
                } else {
                    System.out.println("В этом месяце нет такого дня");
                }
            } else {
                if ((namberday >= 1) && (namberday <= 30)) {
                    System.out.println("В этом месяце есть такой день");
                } else {
                    System.out.println("В этом месяце нет такого дня");
                }
            }

        }
    }
}
