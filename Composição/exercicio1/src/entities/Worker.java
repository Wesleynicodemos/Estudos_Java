package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;

    private List <HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

     public void addContract (HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }

    public Double income (Integer year, Integer month) {
        Double value = baseSalary;
        for (HourContract contract : contracts) {
            if (contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month) {
                
                value += contract.totalValue();

            }
            
        }

    return value;
    }
}
