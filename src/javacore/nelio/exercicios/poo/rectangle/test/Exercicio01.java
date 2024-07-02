package javacore.nelio.exercicios.poo.rectangle.test;

import javacore.nelio.exercicios.poo.rectangle.domain.Rectangle;

import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rectangle retan = new Rectangle(3.00, 4.00);
        retan.print();
    }
}
