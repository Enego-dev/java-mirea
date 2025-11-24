package lab17.lists;

import java.util.Scanner;

public class StudentCardIndex {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList<Student> students = new DoublyLinkedList<>();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    // Добавление студента
                    Student student = new Student();
                    student.readFromConsole();
                    students.add(student);
                    System.out.println("Студент добавлен!");
                    break;

                case 2:
                    // Удаление студента
                    System.out.print("Введите индекс для удаления: ");
                    int removeIndex = scanner.nextInt();
                    if (students.remove(removeIndex)) {
                        System.out.println("Студент удален!");
                    } else {
                        System.out.println("Неверный индекс!");
                    }
                    break;

                case 3:
                    // Просмотр всех студентов
                    System.out.println("\n--- Список студентов ---");
                    students.display();
                    break;

                case 4:
                    // Просмотр конкретного студента
                    System.out.print("Введите индекс: ");
                    int viewIndex = scanner.nextInt();
                    Student s = students.get(viewIndex);
                    if (s != null) {
                        s.display();
                    } else {
                        System.out.println("Неверный индекс!");
                    }
                    break;

                case 5:
                    // Очистка списка
                    students.clear();
                    System.out.println("Список очищен!");
                    break;

                case 6:
                    // Проверка на пустоту
                    if (students.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println("В списке " + students.size() + " студентов");
                    }
                    break;

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("=== Картотека студентов ===");
        System.out.println("1. Добавить студента");
        System.out.println("2. Удалить студента");
        System.out.println("3. Показать всех студентов");
        System.out.println("4. Показать студента по индексу");
        System.out.println("5. Очистить список");
        System.out.println("6. Проверить пустоту списка");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }
}