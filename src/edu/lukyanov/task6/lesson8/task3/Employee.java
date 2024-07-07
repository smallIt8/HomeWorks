package src.edu.lukyanov.task6.lesson8.task3;

public class Employee {

    private String fullName;
    private double salary;
    private Employee[] persons;

    public void start(){
        createEmployee();
        Report.generateReport(persons);
    }

    public Employee() {
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public void createEmployee(){
        persons = new Employee[]{
                new Employee("Сидоров А.В.",1050.54),
                new Employee("Петров П.С.", 1537.12),
                new Employee("Васичкин Л.Е", 1234.75)
        };
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}