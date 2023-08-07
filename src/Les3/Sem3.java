package Les3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sem3 {
//    <aside>
//📔 **Текст задачи:**
//    Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//    String s1 = "hello";
//    String s2 = "hello";
//    String s3 = s1;
//    String s4 = "h" + "e" + "l" + "l" + "o";
//    String s5 = new String("hello");
//    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//</aside>


    public static void main(String[] args) {
//        task01(10, 0, 9);
//        task02();
        task03();

    }



    //Текст задачи:
    //Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

    //    static void task1(int size, int min, int max){
//        /*Текст задачи:
//Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.*/
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            list.add((int)(Math.random() * (max - min + 1) + min));
//        }
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//    }
    static void task01(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    //    Текст задачи:
//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.
    static void task02() {
        List list = new ArrayList();
        list.add(23);
        list.add("hello");
        list.add(3.14);
        list.add(453);
        list.add("jecy");
        list.add('v');

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object el = iterator.next();
            if (el instanceof Double) {
//                iterator.remove();
                System.out.print(el + " ");
            }
        }
        System.out.println();
        System.out.println(list);
    }

    static void task03() {
//        Текст задачи:
//        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры.

        List<List<String>> bookShop = new ArrayList<>();
        addBook("fantastic", "name", bookShop);
        addBook("fantastic1", "name1", bookShop);
        addBook("fantastic2", "name2", bookShop);
        addBook("fantastic3", "name3", bookShop);

        System.out.println(bookShop);
    }

    static void addBook(String genre, String name, List<List<String>> shop) {
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).get(0).equals(genre)) {
                shop.get(i).add(name);
                return;
            }
        }
        List<String> str = new ArrayList<>();
        str.add(genre);
        str.add(name);
        shop.add(str);
    }
}
