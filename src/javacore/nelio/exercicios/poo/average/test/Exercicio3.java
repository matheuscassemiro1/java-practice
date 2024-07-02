package javacore.nelio.exercicios.poo.average.test;


import javacore.nelio.exercicios.poo.average.domain.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner entradas = new Scanner(System.in);
                String name = entradas.nextLine();
                double[] notas = new double[3];
                notas[0] = entradas.nextDouble();
                notas[1] = entradas.nextDouble();
                notas[2] = entradas.nextDouble();
                Student estudante = new Student(name, notas);
                estudante.calcularMedia();
        }
}
