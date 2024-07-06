package javacore.nelio.exercicios.poo.pensionato.exercicio;

import javacore.nelio.exercicios.poo.pensionato.domain.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    /*
    A dona de um pensionato possui 10 quartos para alugar para estudantes,
    sendo estes quartos identificados pelos números de 0 a 9.

    Fazer um programa que inicie com os 10 quartos vazios, e depois leia uma quantidade N
    representando o número de estudantes que vão alugar quartos (N pode ser de 1 até 10).
    Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar
    o nome e o email do estudante, bem como o quarto escolhido (entre 0 a 9).
    Ao final do programa, deve ser impresso por ordem dos quartos os quartos que estão alugados.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rent[] quartos = new Rent[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int repeticoes = sc.nextInt();
        while (repeticoes < 1 || repeticoes > 10){
            System.out.println("Min 1 student and max 10 students for rent");
            System.out.print("How many rooms will be rented? ");
            repeticoes = sc.nextInt();
        }
        for(int i = 0; i < repeticoes; i++){
            sc.nextLine();
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            while(room < 0 || room > 9){
                System.out.println("Only rooms between 0~9 can be selected");
                System.out.print("Room: ");
                room = sc.nextInt();
            }
            quartos[room] = new Rent(name, email);
        }
        for (int i = 0; i < quartos.length; i++){
            if (quartos[i] != null){
                System.out.printf("%d: %s\n", i, quartos[i].toString());
            }
        }
        sc.close();
    }
}
