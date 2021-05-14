package HomeWork2_Veronika;

import java.util.Scanner;

//3 (3 балла). Задать пользователю любой вопрос и дать
//        ограниченное количество попыток для верного ответа.
//        Предусмотреть возможность сдаться.
public class Task2_3Veronika {
    public static void main(String[] args) {
        System.out.println("Кто написал картину \"Чёрный супрематический квадрат\" ");
        System.out.println("У вас три попытки! Если хотите сдаться нажмите +!");
        int attempt = 1;
        String answerRigHt = "МАЛЕВИЧ";
        while (attempt <= 3) {
            System.out.println("Ваша " + attempt + "-я попытка");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer == "+") {
                System.out.println("Вы вышли из опросника!");
                break;
            }

            String answerUpper = answer.toUpperCase();
            String answerUperrTrim = answerUpper.trim();
            System.out.println(answerUperrTrim);
            if (answerUperrTrim.equals(answerRigHt) == true){
            System.out.println("Верный ответ");
                break;
            } else {
                attempt = attempt + 1;
                System.out.println("Ваш ответ неверный, повторите попытку!");
            }
            ;
        }
        if (attempt == 4) {
            System.out.println("Вы использовали все попытки!");
        }
    }

}