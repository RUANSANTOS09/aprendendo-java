package cursomaratonajava.javacore.introducaometodos.dominios;

public class ImpressoraEstudante {
    public void imprime(EstudanteMetodos estudanteMetodos){
        System.out.println("----------");
        System.out.println(estudanteMetodos.nome);
        System.out.println(estudanteMetodos.idade);
        System.out.println(estudanteMetodos.sexo);
        estudanteMetodos.nome = "Fabio"; //Alterando valor
    }

}
