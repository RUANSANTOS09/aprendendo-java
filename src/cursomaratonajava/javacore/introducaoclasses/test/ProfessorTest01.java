package cursomaratonajava.javacore.introducaoclasses.test;

import cursomaratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Rogerio";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Nome: " +professor.nome + " idade: " +professor.idade + " sexo: " +professor.sexo);

    }
}
