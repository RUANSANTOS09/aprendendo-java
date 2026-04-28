package cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Iphone 16 Pro MAX";
        produto.quantidade = 20;
        produto.preços = new double[] {7000,5000,6000};
        produto.exibir();
    }
}
