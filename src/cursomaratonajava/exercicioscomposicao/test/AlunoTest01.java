package cursomaratonajava.exercicioscomposicao.test;

import cursomaratonajava.exercicioscomposicao.dominio.Aluno;
import cursomaratonajava.exercicioscomposicao.dominio.Unidade;

public class AlunoTest01 {
    public static void main(String[] args) {
        Unidade u1 = new Unidade();
        u1.notaProva = 3.0;
        u1.notaTrabalho = 2.0;
        u1.notaParticipacao = 1.0;

        Unidade u2 = new Unidade();
        u2.notaProva = 4.0;
        u2.notaTrabalho = 2.5;
        u2.notaParticipacao = 1.0;

        Unidade u3 = new Unidade();
        u3.notaProva = 3.5;
        u3.notaTrabalho = 2.0;
        u3.notaParticipacao = 1.5;

        Aluno aluno = new Aluno();
        aluno.nome = "Carlos";
        aluno.unidades = new Unidade[]{u1,u2,u3};
       aluno.exibir();
    }
}
