package javacore.nelio.exercicios.poo.employeeSalaryIncrease.entities;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        this.salary += percentage * salary / 100;
    }
    public long getId(){
        return this.id;
    }

    public String toString(){
        return "#" + this.id + " - " + this.name + " | $ " + String.format("%.2f", this.salary);
    }
}
