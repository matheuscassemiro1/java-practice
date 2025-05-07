package javacore.nelio.exercicios.poo.salariosTrabalhador.domain.entities;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Worker {
    private String department;
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String department, String name, WorkerLevel level, double baseSalary) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        double soma = this.contracts.stream().filter(c -> c.getDate().getMonth() == month && c.getDate().getYear() == year).mapToDouble(HourContract::totalValue).sum() + this.baseSalary;;
        return soma;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
