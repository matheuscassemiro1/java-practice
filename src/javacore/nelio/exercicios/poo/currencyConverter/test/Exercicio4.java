package javacore.nelio.exercicios.poo.currencyConverter.test;

import javacore.nelio.exercicios.poo.currencyConverter.domain.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entradas = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double precoDolar = entradas.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantidadeDolar = entradas.nextDouble();
        double resultado = CurrencyConverter.exchange(precoDolar, quantidadeDolar);
        System.out.printf("\nAmount to be paid in reais = %.2f", resultado);

        entradas.close();
    }
}
