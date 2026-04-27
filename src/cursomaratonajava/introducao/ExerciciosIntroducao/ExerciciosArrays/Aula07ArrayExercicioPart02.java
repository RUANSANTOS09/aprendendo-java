package cursomaratonajava.introducao.ExerciciosIntroducao.ExerciciosArrays;

public class Aula07ArrayExercicioPart02 {
    public static void main(String[] args) {
        /*
         * Exercício: Contagem Seletiva em Arrays
         * 1. O objetivo é identificar e contar quantos elementos atendem a um critério específico (ser par).
         * 2. Diferente de apenas listar os valores, aqui utilizamos uma variável 'contador'
         * externa ao loop para acumular as ocorrências.
         * 3. O operador de resto (%) permite filtrar os dados, e o incremento (++)
         * registra cada "sucesso" encontrado durante a varredura do Array.
         */
        int[] numPar = {2, 7, 10, 15, 20, 25, 30};
        int contador = 0;
        for (int percArray : numPar) {
            if (percArray % 2 == 0){
               contador++;
            }
        }
        System.out.println("Total de números pares: " + contador);
    }
}
