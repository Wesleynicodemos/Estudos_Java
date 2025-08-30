package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department's name: ");
        String departmentName = sc.next();


        System.out.println("Enter Worker's data: ");

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();;
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
        
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter contract #" + (i+1) + "data: ");

            System.out.print("Date (DD/MM/YYYY): ");
            
            String date = sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date1 = LocalDate.parse(date, formatter);
            System.out.println("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            System.out.println();

            HourContract contractInfo = new HourContract(date1, hours, value);
            worker.addContract(contractInfo);

        }
    
        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2)); 
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Name: " + worker.getName());
        double income = worker.income(year, month);

        System.out.println("Income: " + income);
        sc.close();
    }
}
