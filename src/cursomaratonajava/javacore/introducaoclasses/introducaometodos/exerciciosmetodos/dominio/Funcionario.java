package cursomaratonajava.javacore.introducaoclasses.introducaometodos.exerciciosmetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (double salario:salarios) {
            System.out.print(salario + " ");

        }
        imprimeMediaSalarios();

    }
    public  void imprimeMediaSalarios() {
        if (salarios != null){
            return;
        }
        double media = 0;
            for (double salario : salarios) {
                media += salario;
                media /= salarios.length;
        }
            System.out.println("\nMédia salarial: " + media);
        }
}

