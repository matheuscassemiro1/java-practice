package javacore.nelio.exercicios.poo.matirzMporN;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    /*
    Exercício proposto: Criar uma matriz M por N e popular ela, em seguida, o usuário insere um número Y
    e ele deve checar as ocorrências deste número na matriz,
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho da matriz M: ");
        int matM = sc.nextInt();
        System.out.print("Insira o tamanho da matriz N: ");
        int matN = sc.nextInt();
        System.out.println("-------------------------");
        int[][] matriz = new int[matM][matN];
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Insira os %d números da linha #%d:\n", matriz[i].length, i);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Insira o número para encontrar os dados: ");
        int encontrar = sc.nextInt();
        for (int linha = 0; linha < matriz.length; linha++){
            for (int item = 0; item < matriz[linha].length; item++){
                if(matriz[linha][item] == encontrar){
                    System.out.printf("---- ENCONTRADO ---- [LINHA: %d INDEX: %d]\n", linha, item);
                    System.out.printf("Esquerda: %d\n", (item -1 >= 0 ? matriz[linha][item -1] : null));
                    System.out.printf("Direita: %d\n", (matriz[linha].length -1 >= item +1 ? matriz[linha][item +1] : null));
                    System.out.printf("Cima: %d\n", (linha -1 >= 0 ? matriz[linha -1][item] : null));
                    System.out.printf("Baixo: %d\n", (matriz[linha].length -1 >= linha +1 ? matriz[linha +1][item] : null));
                }
            }
        }
        System.out.print("Diagonal principal: ");
        for (int linha = 0; linha < matriz.length; linha++){
            System.out.printf(matriz[linha][linha] + " ");
        }

    }
}
