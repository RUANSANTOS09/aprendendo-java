package cursomaratonajava.javacore.introducaoclasses.introducaometodos.dominios;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { // (int num1, int num2) = parametro

        System.out.println(num1 * num2);
    }

    public double dividedoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    //Usando return no public void

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        } //Esse é o "break" do public void = return;
        System.out.println("Não existe divisão por zero!!!!!!!!!!");
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 10;
        numero2 = 20;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero1 = " + numero1);
        System.out.println("Numero2 = " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
            System.out.println(soma);
    }

    //Usando Varargs

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    }
