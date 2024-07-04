package javacore.pratica.vetores.paresNoVetor;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesNoVetor {
    public static void main(String[] args) {
    /*
    Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre
     na tela:
      - todos os números pares
      - a quantidade de números pares
    */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int repeticoes = scan.nextInt();
        int[] vetor = new int[repeticoes];
        int quantidadePares = 0;
        for (int vezes = 0; vezes < repeticoes; vezes++) {
            vetor[vezes] = scan.nextInt();
        }
        System.out.print("Pares: ");
        for(int numero : vetor){
            if (numero % 2 == 0){
                quantidadePares += 1;
                System.out.printf(numero + " ");
            }
        }
        System.out.println();
        System.out.print("Quantidade de pares: " + quantidadePares);
    }
}
