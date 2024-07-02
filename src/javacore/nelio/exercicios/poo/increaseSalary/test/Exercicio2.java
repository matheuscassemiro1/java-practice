package javacore.nelio.exercicios.poo.increaseSalary.test;

import javacore.nelio.exercicios.poo.increaseSalary.domain.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Name: ");
        String name = entrada.nextLine();
        System.out.print("Gross Salary: ");
        double salary = entrada.nextDouble();
        System.out.print("Tax: ");
        double tax = entrada.nextDouble();
        Employee func = new Employee(name, salary, tax);
        func.netSalary();
        System.out.println(func.print());
        System.out.print("Which percentage to increase salary? ");
        System.out.print("Updated data: " + func.increaseSalary(entrada.nextDouble()));
    }
}
