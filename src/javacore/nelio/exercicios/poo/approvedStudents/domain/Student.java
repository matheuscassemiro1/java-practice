package javacore.nelio.exercicios.poo.approvedStudents.domain;

public class Student {
    private String nome;
    private double[] notas;

    public Student(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia(){
        double somaNotas = 0;
        for (double nota : notas){
            somaNotas += nota;
        }
        return somaNotas / notas.length;
    }

    public String getNome(){
        return this.nome;
    }
}
