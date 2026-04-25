package maratonajava.introducao.ExerciciosIntroducao;

public class Aula08ArrayMultimensionalExercicioPart01 {
    public static void main(String[] args) {
        /*
         * Exercício de Array Multidimensional com For-Each:
         * 1. Inicializa uma matriz 2x3 para representar um estoque.
         * 2. Utiliza o laço 'for-each' para percorrer a matriz de forma simplificada:
         * - O primeiro loop extrai cada linha (que é um array de inteiros 'int[]').
         * - O segundo loop extrai cada elemento individual ('int num') de dentro dessa linha.
         * 3. Esta abordagem aumenta a legibilidade do código ao evitar o controle manual de índices.
         */

        int[][] estoque = new int[2][3];
        estoque[0][0] = 10;
        estoque[0][1] = 20;
        estoque[0][2] = 30;

        estoque[1][0] = 40;
        estoque[1][1] = 50;
        estoque[1][2] = 60;
        for(int[] arrBase: estoque){
            for (int num: arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
