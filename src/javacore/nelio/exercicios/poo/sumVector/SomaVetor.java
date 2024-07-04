package javacore.nelio.exercicios.poo.sumVector;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor

     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int repeticoes = sc.nextInt();
        double[] vetor = new double[repeticoes];
        for(int i = 0; i < repeticoes; i++){
            vetor[i] = sc.nextDouble();
        }
        double sum = 0;
        System.out.print("VALORES = ");
        for(double numero : vetor){
            sum += numero;
            System.out.print(numero + " ");
        }
        System.out.println("\nSOMA = " + sum);
        System.out.println("MEDIA = " + sum / vetor.length);
    }
}
