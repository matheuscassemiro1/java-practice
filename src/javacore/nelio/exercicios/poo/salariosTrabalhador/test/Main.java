package javacore.nelio.exercicios.poo.salariosTrabalhador.test;

import javacore.nelio.exercicios.poo.salariosTrabalhador.domain.entities.HourContract;
import javacore.nelio.exercicios.poo.salariosTrabalhador.domain.entities.Worker;
import javacore.nelio.exercicios.poo.salariosTrabalhador.domain.entities.WorkerLevel;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* OBJETIVO DO EXERCÍCIO:
Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo

Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00
 */


public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String department = sc.next();
        System.out.println("Enter work data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker? ");
        int amountContract = sc.nextInt();

        Worker worker = new Worker(department, name, WorkerLevel.valueOf(level), baseSalary);
        for (int i = 0; i < amountContract; i++) {
            System.out.printf("Enter contract #%s data:\n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String[] date = sc.next().split("/");
            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();
            System.out.print("Duration: ");
            int duration = sc.nextInt();
            Date dateFormated = new Date(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));

            HourContract contract = new HourContract(dateFormated, valueHour, duration);
            worker.addContract(contract);
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String[] dateIncome = sc.next().split("/");
        double income = worker.income(Integer.parseInt(dateIncome[1]), Integer.parseInt(dateIncome[0]));
        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment());
        System.out.printf("Income for %s/%s: %s\n", dateIncome[0], dateIncome[1], income);
    }
}
