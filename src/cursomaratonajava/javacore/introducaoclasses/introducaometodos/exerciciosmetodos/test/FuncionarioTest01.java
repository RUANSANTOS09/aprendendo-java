package cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.nome = "Leonardo";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{1200,1400,1900};
        funcionario.imprime();
    }
}
