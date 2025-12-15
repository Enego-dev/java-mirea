package lab26;

import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        CustomList<String> myList = new CustomArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        myList.add("JavaScript");

        System.out.println("Размер списка: " + myList.size());
        System.out.println("Элемент с индексом 1: " + myList.get(1));

        // мой итератор
        System.out.println("\nИтерация с помощью моего итератора:");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Используем for-each (т.к. реализовали Iterable)
        System.out.println("\nИтерация с помощью for-each:");
        for (String language : myList) {
            System.out.println(language);
        }

        // удаление через итератор
        System.out.println("\nУдаление элемента 'C++' через итератор:");
        iterator = myList.iterator();
        while (iterator.hasNext()) {
            String lang = iterator.next();
            if (lang.equals("C++")) {
                iterator.remove();
                System.out.println("Удалён: " + lang);
            }
        }

        System.out.println("\nСписок после удаления:");
        for (String language : myList) {
            System.out.println(language);
        }
    }
}