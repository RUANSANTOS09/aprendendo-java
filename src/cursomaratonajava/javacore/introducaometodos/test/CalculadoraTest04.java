package cursomaratonajava.javacore.introducaometodos.test;

import cursomaratonajava.javacore.introducaometodos.dominios.Calculadora;
/*
 * PASSAGEM DE PARÂMETROS POR VALOR (Pass by Value)
 *
 * Em Java, tipos primitivos (int, double, boolean, etc.) são sempre
 * passados para métodos POR VALOR — ou seja, o método recebe uma
 * CÓPIA do valor original, nunca a variável em si.
 *
 * Consequência prática:
 * Qualquer alteração feita nos parâmetros DENTRO do método
 * não afeta as variáveis declaradas FORA dele.
 *
 * Exemplo desta aula:
 *   - 'a = 1' e 'b = 2' são declarados no main
 *   - O método alteraDoisNumeros(a, b) recebe cópias: numero1=1, numero2=2
 *   - Dentro do método, numero1 e numero2 são alterados para 10 e 20
 *   - Mas ao voltar para o main, 'a' continua 1 e 'b' continua 2
 *
 * Saída esperada:
 *   Dentro do alteraDoisNumeros → Num1 = 10, Num2 = 20  (cópias alteradas)
 *   Dentro do CalculadoraTest04 → a = 1,   b = 2        (originais intactos)
 */
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
