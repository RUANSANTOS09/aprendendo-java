package cursomaratonajava.introducao.ExerciciosIntroducao;

public class Aula05EstruturaCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 36000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;  //Porcetagem a ser paga
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;  //Porcetagem a ser paga
        } else{
            valorImposto = salarioAnual * terceiraFaixa; //Porcetagem a ser paga
        }
        System.out.println("Voce recebe " + salarioAnual + " euros, tera que pagar a taxa de " +valorImposto);
    }
}
