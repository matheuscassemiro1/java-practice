package javacore.nelio.exercicios.poo.bankATM.test;

import javacore.nelio.exercicios.poo.bankATM.domain.Account;

import java.util.Locale;
import java.util.Scanner;

public class bankExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account account;
        Scanner entradas = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = entradas.nextInt();
        entradas.nextLine();

        System.out.print("Enter account holder: ");
        String holder = entradas.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String depositOption = entradas.next();
        if (depositOption.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialValue = entradas.nextDouble();
            account = new Account(number, holder, initialValue);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = entradas.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a widthdraw value: ");
        double withdrawValue = entradas.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        entradas.close();
    }
}
