package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Employee #"+ (i+1) + " data: ");
            System.out.println("Outsourced (y/n)? ");
            sc.nextLine();
            String answer = sc.next();

            switch (answer) {
                case "y":
                    System.out.print("Name: ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("Hours: ");
                    Integer hours = sc.nextInt();
                    System.out.print("Value per hours: ");
                    Double value = sc.nextDouble();
                    System.out.print("Addtional Charge: ");
                    Double additional = sc.nextDouble();

                    employees.add(new OutsourcedEmployee(name, hours, value, additional));

                    break;
                
                case "n":
                System.out.print("Name: ");
                name = sc.next();
                System.out.print("Hours: ");
                hours = sc.nextInt();
                sc.nextLine();
                System.out.print("Value per hours: ");
                value = sc.nextDouble();

                employees.add(new Employee(name, hours, value));

                    break;    
                default:
                System.out.println("Enter (y/n).");
                    break;
            }
        }

        System.out.println();
        System.out.println("Payments: ");

        for(Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
