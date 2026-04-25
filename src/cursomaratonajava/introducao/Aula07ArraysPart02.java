package cursomaratonajava.introducao;

public class Aula07ArraysPart02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        //char 'u/0000' '  '
        //boolean false
        //String null
        String [] nomes = new String[4];
        nomes[0] = "Joao";
        nomes[1] = "Fernando";
        nomes[2] = "Mario";
        nomes[3] = "Maria";
        for (int i = 0; i < nomes.length; i++) { // .length indica o tamanho (total de elementos) da lista.

            System.out.println(nomes[i]);

        }
    }
}
