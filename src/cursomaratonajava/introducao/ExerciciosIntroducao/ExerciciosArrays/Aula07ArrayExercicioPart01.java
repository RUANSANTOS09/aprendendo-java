package cursomaratonajava.introducao.ExerciciosIntroducao.ExerciciosArrays;

public class Aula07ArrayExercicioPart01 {
    public static void main(String[] args) {
        /*
         * Exercício de Lógica de Programação:
         * 1. Inicializa um array de inteiros com 8 posições.
         * 2. Percorre o array utilizando um laço de repetição 'for'.
         * 3. Utiliza uma estrutura condicional 'if' para filtrar e imprimir
         * apenas os números que são maiores que 10.
         */
        int[] number = {5, 12, 8, 25, 3, 14, 7, 20};

        for (int j : number) {
            if (j > 10) {
                System.out.println(j);
            }

        }
    }
}
