package src.edu.lukyanov.task6.lesson8.task3;

public class Report {

    public static void generateReport(Employee[] persons) {
        System.out.println("Отчет о зарплате сотрудников:");
        System.out.printf("%-30s | %30s%n", "Полное имя", "Заработная плата");
        for (Employee employee : persons) {
            System.out.printf("%-30s | %30.2f%n", employee.getFullName(), employee.getSalary());
        }
    }
}