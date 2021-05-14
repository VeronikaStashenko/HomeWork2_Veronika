package HomeWork3_Veronika;

//11.31. Напишите класс, который выводит на экран положительные двузначные числа,
//        заканчивающиеся на цифру 7 (начиная с наименьшего).
public class Task3_2_Veronika {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
    }
}
