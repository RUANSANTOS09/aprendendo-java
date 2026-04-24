package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        double number02 = 20;
        double resultado = number01 / number02; //Resultado será 0.5, mas 0.5 não é um numero inteiro, com isso corrigimos o int, para double
        System.out.println("Resultado: " + resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores de Comparação: < : menor > : maior <= : maior ou igual >= : menor ou igual == : comparação != : diferente
        boolean isDezMaiorQueVinte = 10 > 20; //true
        boolean isDezMenorQueVinte = 10 < 20; //false
        boolean isDezIgualVinte = 10 == 20; //false
        boolean isDezMenorOuIgualVinte = 10 <= 20; //true
        boolean isDezMaiorOuIgualVinte = 10 >= 20; //false
        boolean isDezDiferenteDeVinte = 10 != 20; //true
        System.out.println(" isDezMenorQueVinte " +  isDezMenorQueVinte);
        System.out.println(" isDezMaiorQueVinte " +  isDezMaiorQueVinte);
        System.out.println(" isDezIgualVinte " +  isDezIgualVinte);
        System.out.println("  isDezMenorOuIgualVinte " +   isDezMenorOuIgualVinte);
        System.out.println(" isDezMaiorOuIgualVinte " +  isDezMaiorOuIgualVinte);
        System.out.println(" isDezDiferenteDeVinte " +  isDezDiferenteDeVinte);

        //Operaadores Lógicos: && (AND) || (OR) ! (LOGICALNOT)
        int age = 29;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQuetrinta = age >= 30 && salario  >= 4612;
        boolean isDentroDaLeiMenorQuetrinta = age < 30 && salario  >= 3381;
        System.out.println("isDentroDaLeiMaiorQuetrinta " + isDentroDaLeiMaiorQuetrinta);
        System.out.println("isDentroDaLeiMenorQuetrinta " + isDentroDaLeiMenorQuetrinta);

        double  valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationFiveCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationFiveCompravel " + isPlaystationFiveCompravel);

        //Operadores de Atribuicao: = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0
        System.out.println(bonus);

        //Operador de Incremento ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++; // Adiciona mais 1; 2
        contador--; // Tira 1; 1
        int contador2 = 0;
        System.out.println(++contador2); // 1
        // contador++; Pós-incremento: usa o valor atual e DEPOIS incrementa
        // ++contador; Pré-incremento: incrementa primeiro e DEPOIS usa o novo valor


    }
}