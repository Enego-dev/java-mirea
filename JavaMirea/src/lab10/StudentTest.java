package lab10;

public class StudentTest {
    static void main() {
        // ВМИГ - высшая математика и геометрия
        // ВПИА - высшее программирование и анализ
        var s1 = new Student("Булат", "Бальжинов", "Промышленная Информатика", 2, "КВБО-31-24", 4.5);
        var s2 = new Student("Тимур", "Булатов", "Высшая Математика", 5, "ВМИГ-01-21", 5);
        var s3 = new Student("Дамир", "Тимуров", "Высшая Информатика", 1, "ВПИА-01-22", 4.9);
        var s4 = new Student("Влад", "Клейменов", "Прикладная Информатика", 3, "КМБО-13-24", 4);
        var s5 = new Student("Артем", "Абаджанян", "ПИШ", 2, "ПВБО-01-24", 3);

        var s9 = new Student("Мишаня", "Медведев", "Промышленная Информатика", 2, "КВБО-31-24", 4.4);
        var s8 = new Student("Алекс", "Быков", "Промышленная Информатика", 2, "КВБО-31-24", 3.9);
        var s7 = new Student("Ваня", "Щегол", "Промышленная Информатика", 2, "КВБО-31-24", 4.3);

        var students1 = new Student[] {s1, s2, s3, s4, s5};
        var students2 = new Student[] {s9, s8, s7};

        var sorting = new SortingStudentsByGPA();

        // Тестируем функционал с s1-s5
        sorting.setArray(students1);
        sorting.outArray();

        sorting.sortByGPA();
        sorting.outArray();

        sorting.sortByFirstName();
        sorting.outArray();

        sorting.sortByLastName();
        sorting.outArray();

        sorting.sortBySpeciality();
        sorting.outArray();

        sorting.sortByCourse();
        sorting.outArray();

        sorting.sortByGroup();
        sorting.outArray();

        sorting.mergeSort(new StudentComparator());
        sorting.outArray();

        // понятно, что с s2 будет так же, так что объединю 2 массива в 1 и отсортирую его по GPA
        sorting.mergeStudentsAndSet(students1, students2);
        sorting.sortByGPA();
        sorting.outArray();
    }
}
