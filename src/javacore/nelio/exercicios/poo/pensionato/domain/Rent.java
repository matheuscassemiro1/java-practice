package javacore.nelio.exercicios.poo.pensionato.domain;

public class Rent {
    private String nome;
    private String email;

    public Rent(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public String toString() {
        return nome + ", " + email;
    }
}
