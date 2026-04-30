package cursomaratonajava.javacore.sobrecargametodos.test;

import cursomaratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Demon Slayer", "Demográfia", 120, "Ação");
        anime.imprime();
    }
}
