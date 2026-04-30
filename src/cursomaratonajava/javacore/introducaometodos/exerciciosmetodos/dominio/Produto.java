package cursomaratonajava.javacore.introducaometodos.exerciciosmetodos.dominio;

public class Produto {
    public String nome;
    public int quantidade;
    public double[] preços;

    public void exibir(){
        System.out.println(this.nome);
        System.out.println(this.quantidade);
        if (preços == null){
            return;
        }
        for (double preço: preços){
            System.out.println(preço + " ");
        }
        exibirMedia();
    }
    public void exibirMedia(){
        if (preços == null){
            return;
        }
        double soma = 0;
        for (double preço: preços){
            soma += preço;
        }
        double mediaProduto = soma / preços.length;
        System.out.println("\n MEdia dos preços " + mediaProduto);
    }

}
