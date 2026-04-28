package cursomaratonajava.exercicioscomposicao.dominio;

public class Aluno {
    public String nome;
    public Unidade[] unidades;
    public void exibir(){
        System.out.println("Aluno: " + nome);
        if (unidades == null){
            return;
        }
        exibirResultadoUnidades();
        CalcularSituaçãoFinal();
    }
    public void exibirResultadoUnidades(){
        for (int i = 0; i < unidades.length; i++) {
            Unidade u = unidades[i];
            System.out.println("\nUnidade" + (i + 1) + ": ");
            System.out.println("Media: " + u.calcularMedia());
            if (u.aprovado()){
                System.out.println("  Situação: aprovado na unidade");
            } else {
                System.out.println("  Situação: reprovado na unidade");
            }
        }
    }
    public void CalcularSituaçãoFinal(){
        double somaMedias = 0;
        for (Unidade u : unidades){
            somaMedias += u.calcularMedia();
        }
        System.out.println("\n Soma das medias: " + somaMedias);
        if (somaMedias >= 15){
            System.out.println("Resultado Final: Aluno Aprovado");
        } else {
            System.out.println("Resultado Final: Recuperação!!!!!!!!!!!!!!!");
        }
    }
}
