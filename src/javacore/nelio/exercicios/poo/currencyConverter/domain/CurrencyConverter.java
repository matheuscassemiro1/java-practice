package javacore.nelio.exercicios.poo.currencyConverter.domain;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double exchange(double dolarPrice, double amount){
        double total = dolarPrice * amount;
        total = total + (total * IOF / 100);
        return total;
    }
}
