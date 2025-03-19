package zad2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class FullReport {

    public static void generateReport(Employee[] employees,Locale locale) {


        ResourceBundle bundleLang = ResourceBundle.getBundle("task2",locale);
        //ResourceBundle bundleRU = ResourceBundle.getBundle("task2", localeRU);
        double kUSD = Double.parseDouble(bundleLang.getString("k"));
      //  double kRUB = Double.parseDouble(bundleRU.getString("k"));

        NumberFormat numberFormatUSD = NumberFormat.getCurrencyInstance(locale);
    //    NumberFormat numberFormatRUB = NumberFormat.getCurrencyInstance(localeRU);

       // System.out.println("Отчет на английском (USD и рубли):");
        System.out.printf("%-15s %s%n", bundleLang.getString("fullname"), bundleLang.getString("sallary"));

        for (Employee employee : employees) {
            double salaryUSD = employee.getSalary() / kUSD;
            String formattedSalary = numberFormatUSD.format(salaryUSD);
            System.out.printf("%-15s %15s%n", employee.getFullname(), formattedSalary);
        }
        

    }
}
