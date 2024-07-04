package javacore.nelio.exercicios.poo.heightCalculate.test;

import javacore.nelio.exercicios.poo.heightCalculate.domain.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class CalcularAltura {
    /*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
    Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
    de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int repeticoes = sc.nextInt();
        Pessoa[] vetor = new Pessoa[repeticoes];
        for (int i = 0; i < repeticoes; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
        }
        double sumAltura = 0;
        int pessoasMenorDezesseis = 0;
        for (Pessoa pessoa : vetor) {
            sumAltura += pessoa.getAltura();
            if (pessoa.getIdade() < 16) {
                pessoasMenorDezesseis += 1;
            }
        }
        System.out.printf("Altura média: %.2f\n", sumAltura / vetor.length);
        double porcentagem = (double) pessoasMenorDezesseis / (double) vetor.length * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
        for (Pessoa pessoa : vetor) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
    }
}
