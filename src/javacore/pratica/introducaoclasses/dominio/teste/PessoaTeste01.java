package javacore.pratica.introducaoclasses.dominio.teste;

import javacore.pratica.introducaoclasses.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa aluno = new Pessoa();

        aluno.nome = "Maic";
        aluno.idade = 24;
        aluno.sexo = 'M';
        System.out.println("Pessoa 1");
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);
    }
}
