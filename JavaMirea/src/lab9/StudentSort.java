package lab9;

import java.util.Arrays;
import java.util.Random;

public class StudentSort {
    static void main() {
        var random = new Random();
        Student[] students = new Student[] {new Student(random.nextInt(), 64), new Student(random.nextInt(), 25),
                new Student(random.nextInt(), 58), new Student(random.nextInt(), 29)};

        for (var student : students){
            IO.println(student);
        }

        IO.println("");

        InsertionSort.insertionSort(students);

        for (var student : students){
            IO.println(student);
        }

        IO.println("");

        Arrays.sort(students, new SortingStudentsByGPA());
        for (var student : students){
            IO.println(student);
        }
    }
}
