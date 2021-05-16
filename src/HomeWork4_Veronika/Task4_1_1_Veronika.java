package HomeWork4_Veronika;
//1. Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
//        разделённых пробелами (2 способ - StringBuilder).
import java.util.Random;

public class Task4_1_1_Veronika {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        StringBuilder newString = new StringBuilder("");
        for (int i = 0; i < 100; i++) {
            number = random.nextInt(1000);
            newString.append(number + " ");
        }
        System.out.println(newString);
    }
}
