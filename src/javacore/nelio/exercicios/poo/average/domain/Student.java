package javacore.nelio.exercicios.poo.average.domain;

public class Student {
    public String name;
    public double[] notas;
    public double nota;
    public double media = 60;
    public Student(String name, double[] notas) {
        this.name = name;
        this.notas = notas;
    }

    public void calcularMedia() {
        for (double nota : notas) {
            this.nota += nota;
        }

        if (nota >= 60) {
            System.out.printf("FINAL GRADE = %.2f \n", nota);
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f \n", nota);
            System.out.println("\nFAILED");
            System.out.printf("\nMISSING %.2f POINTS", Math.abs(nota - media));
        }
    }
}
