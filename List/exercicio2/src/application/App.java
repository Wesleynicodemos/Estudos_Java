package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many user will be registered: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {

        System.out.println("Employee #" + (i+1) + ": ");
        System.out.println();
        System.out.print("id: ");
        int id = sc.nextInt();
        System.out.print("name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        employee = new Employee(id, name, salary);
        employees.add(employee);
    }

    System.out.print("Enter the employee id that will have salary encrease: ");
    int id = sc.nextInt();
    
    Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

    if (emp == null) {
        System.out.println("This id does not exist.");
    } else {
        System.out.print("Enter the percentage:");
        double percentage = sc.nextDouble();
        emp.getNewSalary(percentage);
    }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee list : employees) {
            System.out.println(list);
        }

        sc.close();
    }

}
