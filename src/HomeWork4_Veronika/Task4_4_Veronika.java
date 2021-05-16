package HomeWork4_Veronika;
//4. Разбить строку на отдельные слова и посчитать количество вхождений
// для каждого слова. - через split - будет считать разделителем пробел
// "кот кот кот собака" - кот: 3, собака: 1

import java.util.Scanner;

public class Task4_4_Veronika {
    public static void main(String[] args) {
        System.out.println("Введите предложение - ");
        StringBuilder newString = new StringBuilder(" ");
        Scanner scanner =new Scanner(System.in);
        String sentence = scanner.next();
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
