package javacore.nelio.exercicios.poo.employeeSalaryIncrease.application;

import javacore.nelio.exercicios.poo.employeeSalaryIncrease.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> lista = new ArrayList<Employee>();
        System.out.print("How many employee will be registered? ");
        int repeticoes = sc.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            System.out.printf("Registering Employee #%d\n", i + 1);
            System.out.print("Employee ID: ");
            long id = sc.nextLong();
            System.out.print("Employee Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Employee Salary: ");
            double salary = sc.nextDouble();
            lista.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        long employeeId = sc.nextLong();
        if (lista.stream().anyMatch(e -> e.getId() == employeeId)) {
            System.out.print("Enter the percentage of increase: ");
            double percentage = sc.nextDouble();
            lista.stream()
                    .filter(e -> e.getId() == employeeId)
                    .forEach(employee -> employee.increaseSalary(percentage));
            for (Employee funcio : lista){
                System.out.println(funcio);
            }

        } else {
            System.out.println("This ID doesn't exist");
        }

        sc.close();
    }
}
