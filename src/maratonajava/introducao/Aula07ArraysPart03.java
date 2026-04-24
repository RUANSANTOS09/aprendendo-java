package maratonajava.introducao;

public class Aula07ArraysPart03 {
    public static void main(String[] args) {
     //  int [] numeros2 = {1,2,3,4,5}; //Outra forma de incializar um array com 5 posições

        int [] numeros3 = new int[]{1,2,3,4,5}; //Outra forma de incializar um array com 5 posições
        for (int num: numeros3){ // No for each, não é possível voce acessar um indice especifico, apenas no for
            System.out.println(num);
        }
    }
}
