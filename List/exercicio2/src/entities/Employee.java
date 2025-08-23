package entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getNewSalary(double percentage) {
        return salary += salary * percentage / 100;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id 
            + ": "
            + name
            + ", "
            + salary;
    }

}
