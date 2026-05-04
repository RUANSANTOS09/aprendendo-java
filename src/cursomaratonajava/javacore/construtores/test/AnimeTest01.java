package cursomaratonajava.javacore.construtores.test;

import cursomaratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer", "Demografia", 120, "Ação","Ufotable");
        anime.imprime();
    }
}
