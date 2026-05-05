package cursomaratonajava.javacore.construtores.exerciciosconstrutores.test;

import cursomaratonajava.javacore.construtores.exerciciosconstrutores.dominio.Jogo;

public class JogoTest01 {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        System.out.println("--- Jogo 1 ---");
        jogo.setTitulo("The Last of Us");
        jogo.setGenero("Aventura");
        jogo.setAnoLancamento(2013);
        jogo.setNota(9.5);
        jogo.setPlataforma("PlayStation");
        jogo.imprime();



        Jogo jogo2 = new Jogo("Hollow Knight", "Metroidvania", 2017);
        System.out.println("--- Jogo 2 ---");
        jogo2.imprime();

        Jogo jogo3 = new Jogo("Elden Ring", "RPG", 2022,9.8, "PC");
        System.out.println("--- Jogo 3 ---");
        jogo3.imprime();


    }
}
