package cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.dominio.AlunoJava;

public class AlunoJavaTest01 {
    public static void main(String[] args) {
        AlunoJava alunoJava = new AlunoJava();
        alunoJava.nome = "Carlos";
        alunoJava.idade = 18;
        alunoJava.notas = new double[]{7.5, 8.0, 9.5, 6.0};
        alunoJava.exibir();
    }
}
