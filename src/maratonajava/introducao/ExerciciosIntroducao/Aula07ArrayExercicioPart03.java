package maratonajava.introducao.ExerciciosIntroducao;

public class Aula07ArrayExercicioPart03 {
    /**
     * Exercício: Modificação de Dados em Arrays
     * 1. O objetivo é atualizar valores específicos dentro de uma estrutura de dados.
     * 2. Utiliza o loop 'for' tradicional porque precisamos do índice [i] para
     * acessar e sobrescrever o valor original na memória.
     * 3. Aplica uma regra de negócio (reajuste de preço) baseada em uma condição,
     * demonstrando como manipular arrays dinamicamente.
     */
    public static void main(String[] args) {
        double [] preco = {20.0, 80.0, 45.0, 100.0, 10.0};
        double newPreco = 5.0;
        for (int i = 0; i < preco.length; i++) {
            if (preco[i] < 50){
                preco[i] += newPreco;
            }
        System.out.println(preco[i]);
        }
    }
}
