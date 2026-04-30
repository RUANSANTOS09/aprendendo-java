package cursomaratonajava.javacore.introducaometodos.exerciciosmetodos.test;

import cursomaratonajava.javacore.introducaometodos.exerciciosmetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Leonardo");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1200,1400,1900});
        funcionario.imprime();
    }
}
