package cursomaratonajava.introducao.ExerciciosIntroducao.ExerciciosEstruturasDeRepeticao;

public class Aula06EstruturasDeRepeticaoExercicioPart01 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000000
        for (int i = 0; i <= 1000000; i ++) {
            if (i % 2 == 0)
              System.out.println(i);
        }
    }
}
