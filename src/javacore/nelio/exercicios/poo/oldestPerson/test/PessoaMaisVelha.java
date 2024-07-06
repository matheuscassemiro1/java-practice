package javacore.nelio.exercicios.poo.oldestPerson.test;

import javacore.nelio.exercicios.poo.oldestPerson.domain.Pessoa;

import java.util.Scanner;

public class PessoaMaisVelha {
    /*
    Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
    Depois, mostrar na tela o nome da pessoa mais velha.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int repeticoes = sc.nextInt();
        Pessoa[] vetor = new Pessoa[repeticoes];
        Pessoa maisVelho = null;
        for(int i = 0; i < repeticoes; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            vetor[i] = pessoa;
            if(i == 0){
                maisVelho = pessoa;
            }
            if (maisVelho != null && maisVelho.getIdade() < pessoa.getIdade()){
                maisVelho = pessoa;
            }
        }
        System.out.printf("O mais velho é: %s, com %s anos!", maisVelho.getNome(), maisVelho.getIdade());
    }
}
