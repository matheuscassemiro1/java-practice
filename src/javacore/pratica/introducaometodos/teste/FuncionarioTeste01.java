package javacore.pratica.introducaometodos.teste;

import javacore.pratica.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcio = new Funcionario("Carlo", 18, new double[]{1500.40, 1500.22, 1700.20});
        funcio.imprime();
        funcio.mediaSalarios();
    }
}
