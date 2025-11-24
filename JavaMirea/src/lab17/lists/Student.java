package lab17.lists;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student() {}

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите группу: ");
        this.group = scanner.nextLine();
    }

    public void display() {
        System.out.println("Студент: " + name + ", Возраст: " + age + ", Группа: " + group);
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет, " + group + ")";
    }
}
