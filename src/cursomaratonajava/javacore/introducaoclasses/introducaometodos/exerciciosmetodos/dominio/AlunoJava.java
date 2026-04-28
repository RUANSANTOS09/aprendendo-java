package cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.dominio;

public class AlunoJava {
    public String nome;
    public int idade;
    public double[] notas;

    public void exibir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (notas == null) {
            return;
        }
        for (double nota: notas){
            System.out.print(nota + " "); //Exibindo Notas
        }
        exibirMedia();
        }
        public void exibirMedia(){
        if (notas == null){
            return;
        }
        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }
        double media = soma / notas.length;
        String relatorio = "\n Media das notas do aluno " + nome + ", " + media;
        System.out.println(relatorio);
    }
}