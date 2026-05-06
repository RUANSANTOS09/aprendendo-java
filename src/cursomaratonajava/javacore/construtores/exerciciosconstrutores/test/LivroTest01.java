package cursomaratonajava.javacore.construtores.exerciciosconstrutores.test;

import cursomaratonajava.javacore.construtores.exerciciosconstrutores.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println("--- Livro 1 ---");
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setAnoPublicacao(1899);
        livro.setNumeroPaginas(256);
        livro.setEditora("Penguin");
        livro.exibir();
        System.out.println("--- Livro 2 ---");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo", 1890);
        livro2.exibir();
        System.out.println("--- Livro 3 ---");
        Livro livro3 = new Livro("Grande Sertão: Varedas", "Guimarães Rosa", 1956, 608, "Nova Fronteira");
        livro3.exibir();

    }
}
