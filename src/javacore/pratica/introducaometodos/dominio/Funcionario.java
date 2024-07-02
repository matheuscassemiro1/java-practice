package javacore.pratica.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
    public Funcionario(String nome, int idade, double[] salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    public void imprime(){
        System.out.println("================");
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void mediaSalarios(){
        double soma = 0;
        for (double receita: salario){
            soma += receita;
        }
        System.out.println("A media é: " + soma / salario.length);
    }
}
