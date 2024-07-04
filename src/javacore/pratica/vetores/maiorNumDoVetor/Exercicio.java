package javacore.pratica.vetores.maiorNumDoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar
     na tela o maior número do vetor e sua posição.
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int repeticoes = scan.nextInt();
        double[] vetor = new double[repeticoes];
        double maiorValor = 0;
        int index = 0;
        for (int vezes = 0; vezes < repeticoes; vezes++){
            double valor = scan.nextDouble();
            vetor[vezes] = valor;
            if (valor > maiorValor) {
                maiorValor = valor;
                index = vezes;
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Index: " + index);
        scan.close();
    }
}
