package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA{
    Student[] iDNumber;

    public void setArray(Student[] students){
        iDNumber = students;
    }

    public void sortByGPA(){
        // Вообще можно и так
        // quicksort(Comparator.comparing(Student::firstName));
        // или так
        // quicksort((s1, s2) -> Double.compare(s2.gpa(), s1.gpa()));
        // но по заданию сказано реализовать интерфейс и использовать его

        quicksort(new StudentComparator());
    }

    public void sortByFirstName(){
        quicksort(Comparator.comparing(Student::firstName));
    }

    public void sortByLastName(){
        quicksort(Comparator.comparing(Student::lastName));
    }

    public void sortBySpeciality(){
        quicksort(Comparator.comparing(Student::speciality));
    }

    public void sortByCourse(){
        quicksort(Comparator.comparing(Student::course));
    }

    public void sortByGroup(){
        quicksort(Comparator.comparing(Student::group));
    }

    public void outArray(){
        for (var student : iDNumber){
            IO.println(student);
        }
        IO.println("");
    }

    public void mergeStudentsAndSet(Student[]... students){
        var f = new ArrayList<Student>();
        for (var s1 : students){
            f.addAll(Arrays.asList(s1));
        }
        iDNumber = f.toArray(new Student[0]);
    }

    public void mergeSort(Comparator<Student> comparator){
        mergeSort(iDNumber, comparator);
    }

    public void mergeSort(Student[] students, Comparator<Student> comparator) {
        if (students.length < 2) return;

        int mid = students.length / 2;
        Student[] left = Arrays.copyOfRange(students, 0, mid);
        Student[] right = Arrays.copyOfRange(students, mid, students.length);

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(students, left, right, comparator);
    }


    private void merge(Student[] arr, Student[] left, Student[] right, Comparator<Student> comparator){
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) >= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    private void quicksort(Comparator<Student> comparator){
        Arrays.sort(iDNumber, comparator);
    }
}