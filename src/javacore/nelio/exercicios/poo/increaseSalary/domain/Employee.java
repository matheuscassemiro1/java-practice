package javacore.nelio.exercicios.poo.increaseSalary.domain;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    private double liquid;

    public Employee(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public String print(){
        return "Employee: " + name + ", $" + String.format("%.2f", liquid);
    }
    public double netSalary(){
        return this.liquid = grossSalary - tax;
    }

    public String increaseSalary(double percentage){
        this.liquid = liquid + (percentage * grossSalary / 100);
        return name + ", " + "$ " + String.format("%.2f", liquid);
    }


}
