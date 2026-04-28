package cursomaratonajava.exercicioscomposicao.dominio;

public class Unidade {
    public double notaProva;
    public double notaTrabalho;
    public double notaParticipacao;

    public double calcularMedia(){
        return notaProva + notaParticipacao + notaTrabalho;
    }
    public boolean aprovado(){
        return  calcularMedia() >= 5;
    }
}
