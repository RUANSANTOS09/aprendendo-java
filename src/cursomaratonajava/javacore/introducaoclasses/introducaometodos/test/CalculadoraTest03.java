package cursomaratonajava.javacore.introducaoclasses.introducaometodos.test;

import cursomaratonajava.javacore.introducaoclasses.introducaometodos.dominios.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double result = calculadora.dividedoisNumeros(10,0);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNumeros(10,0);

    }
}
