package javacore.pratica.vetores.somaDeVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores (A e B), contendo N elementos em cada.
        Em seguida, gere um terceiro vetor (C) onde cada elemento de C é a soma dos elementos correspondentes
        de A e B. Imprima o vetor C gerado.
        */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o tamanho dos vetores: ");
        int tamanhoVetor = scan.nextInt();
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];
        System.out.printf("Insira %d números para o PRIMEIRO vetor:\n", tamanhoVetor);
        for (int vezes = 0; vezes < tamanhoVetor; vezes ++){
            vetorA[vezes] = scan.nextInt();
        }
        System.out.printf("Insira %d números para o SEGUNDO vetor:\n", tamanhoVetor);
        for (int vezes = 0; vezes < tamanhoVetor; vezes ++){
            vetorB[vezes] = scan.nextInt();
        }
        for (int vezes = 0; vezes < tamanhoVetor; vezes ++){
            vetorC[vezes] = vetorA[vezes] + vetorB[vezes];
        }
        System.out.print("Resultado: ");
        for(int resultado : vetorC){
            System.out.print(resultado + " ");
        }
    }
}
