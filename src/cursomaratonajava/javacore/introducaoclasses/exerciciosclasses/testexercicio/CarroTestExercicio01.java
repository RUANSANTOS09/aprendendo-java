package cursomaratonajava.javacore.introducaoclasses.exerciciosclasses.testexercicio;

import cursomaratonajava.javacore.introducaoclasses.exerciciosclasses.dominioexercicio.Carro;

public class CarroTestExercicio01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Volkswagen Voyage";
        carro01.modelo = "Sedã";
        carro01.ano = 2017;
        System.out.println("Nome: " + carro01.nome +" Modelo: " + carro01.modelo +" Ano: "+ carro01.ano);

        carro02.nome = "Nissan GT-R";
        carro02.modelo = "R35";
        carro02.ano = 2008;
        System.out.println("Nome: " + carro02.nome +" Modelo: " + carro02.modelo +" Ano: "+ carro02.ano);

    }
}
