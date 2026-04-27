package cursomaratonajava.javacore.introducaoclasses.introducaometodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.dominios.EstudanteMetodos;
import cursomaratonajava.javacore.introducaoclasses.introducaometodos.dominios.ImpressoraEstudante;

public class EstudanteMetodosTest01 {
    public static void main(String[] args) {
        EstudanteMetodos estudante01 = new EstudanteMetodos();
        EstudanteMetodos estudante02 = new EstudanteMetodos();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
