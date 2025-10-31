package lab3.stringformatting.task3;

public class EmployeeReport {
    public static void generateReport(Employee[] employees){
        // % - начало форматирования одного аргумента (обязательно заканчивается типом данных
        // в моем случае - s (String) и f (Float)

        // %... - выравнивание по правому краю
        // %-... - по левому

        // цифра перед заключительной буквой - максимальная ширина строки в символах

        // %n - новая строка
        System.out.printf("| %-30s | %11s |%n", "ФИО", "Зарплата");
        for (var employee : employees){
            System.out.printf("| %-30s | %10.2f$ |%n", employee.getFullName(), employee.getSalary());
        }
    }
}
