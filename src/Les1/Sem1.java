package Les1;

import java.time.LocalTime;
import java.util.Scanner;

public class Sem1 {

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static void main(String[] args) {
        System.out.println("Введите Ваше имя: ");
        Scanner s = new Scanner(System.in);
        String userName = s.nextLine();
        System.out.println(userName);
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + userName + "!");
        } else if (hour > 12 && hour < 18) {
            System.out.println("Добрый день, " + userName + "!");
        } else if (hour > 18 && hour < 23) {
            System.out.println("Добрый вечер, " + userName + "!");

        } else if (hour > 23 && hour < 5) {
            System.out.println("Доброй ночи, " + userName + "!");
        } else {
            System.out.println("hello");
        }
        s.close();
    }

}


