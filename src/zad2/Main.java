package zad2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван", 1500),
                new Employee("Петров Петр", 22000),
                new Employee("Сидоров Сидор", 5.80),
                new Employee("Кузнецов Николай", 100)
        };
         Locale localeEN = new Locale("en","US");
        Locale localeRU = new Locale("ru", "RU");
        FullReport.generateReport(employees,localeEN);
        FullReport.generateReport(employees,localeRU);
    }
}