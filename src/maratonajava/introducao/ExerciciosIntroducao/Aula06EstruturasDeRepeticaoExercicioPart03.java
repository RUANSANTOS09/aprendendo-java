package maratonajava.introducao.ExerciciosIntroducao;

public class Aula06EstruturasDeRepeticaoExercicioPart03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condiçao valorParcela >= 1000
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
