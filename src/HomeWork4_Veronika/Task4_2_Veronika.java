package HomeWork4_Veronika;

import java.util.Random;
import java.util.regex.Pattern;

//2. В сформированной в 1-ой задаче строке заменить все двузначные числа на -1. -
// RegEx - регулярные выражения

public class Task4_2_Veronika {
    public static class ExampleStringRegex {
        public static void main(String[] args) {
            Random random = new Random();
            int number;
            String str = "";
            int namber;
            for (int i = 0; i < 100; i++) {
                namber = random.nextInt(1000);
                str = str + " " + namber;
            }
            System.out.println(str);
            String strcopy;
            String regestToplase = " [1234567890]{2} ";
            strcopy = str.replaceAll(regestToplase, " -1 ");
            System.out.println(strcopy);
        }
    }
}

