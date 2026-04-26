package cursomaratonajava.javacore.introducaoclasses.introducaometodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.dominios.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
