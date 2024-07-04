package javacore.nelio.exercicios.poo.showNegativeInputs;

import java.util.Scanner;

public class ShowNegatives {
    /*
    Faça um programa que leia um número inteiro positivo N (máximo = 10)
    e depois N números inteiros e armazene-os em um vetor.
    Em seguida, mostrar na tela todos os números negativos lidos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números irá digitar? ");
        int quantidade = sc.nextInt();
        if (quantidade > 10) {
            System.out.println("O máximo de números permitidos é 10!");
        } else {
            int[] vetor = new int[quantidade];
            for (int vezes = 0; vezes < quantidade; vezes++) {
                System.out.print("Digite um número: ");
                vetor[vezes] = sc.nextInt();
            }
            for (int numero : vetor) {
                if (numero < 0) {
                    System.out.println(numero);
                }
            }
        }

    }
}
