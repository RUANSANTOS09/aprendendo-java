package cursomaratonajava.javacore.introducaometodos.test;

import cursomaratonajava.javacore.introducaometodos.dominios.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ruan");
        pessoa.setIdade(18);
        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
