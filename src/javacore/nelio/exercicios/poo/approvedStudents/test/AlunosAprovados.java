package javacore.nelio.exercicios.poo.approvedStudents.test;

import javacore.nelio.exercicios.poo.approvedStudents.domain.Student;

import java.util.Locale;
import java.util.Scanner;

public class AlunosAprovados {
    /*
    Faça um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1° e 2°
    semestres. Depois, imprima os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas
    Seja maior ou igual a 6.0 (seis)
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int repeticoes = sc.nextInt();
        Student[] vetor = new Student[repeticoes];
        for(int i = 0; i < repeticoes; i++){
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vetor[i] = new Student(nome, new double[]{nota1, nota2});
        }
        System.out.println("Alunos aprovados:");
        for(Student aluno : vetor){
            if(aluno.calcularMedia() >= 6){
                System.out.println(aluno.getNome());
            }
        }
        sc.close();
    }
}
