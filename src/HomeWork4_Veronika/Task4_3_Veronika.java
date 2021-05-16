package HomeWork4_Veronika;
//3. Пользователь вводит имя и возраст. Вывести сообщение, приветствующее пользователя,
//        выводя текущую дату и время. - форматирование (String.format) через спецификаторы

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Task4_3_Veronika {
    public static class SimpleDateFormatExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите ваше имя - ");
            String name = scanner.next();
            System.out.println("Введите ваш возраст - ");
            String year = scanner.next();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
            System.out.println("Здравствуйте, "+ name+"!");
            System.out.println("Сегодня : " + dateFormat.format( new Date() ) );

        }
    }
}