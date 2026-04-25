package cursomaratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short,long, boolean

        // --- NÚMEROS INTEIROS (Sem casa decimal) ---
        int age = 39; // int: Inteiro padrão. É o "feijão com arroz" para números sem vírgula.
        int ageSon = 10; // int: Inteiro padrão. É o "feijão com arroz" para números sem vírgula.
        byte idadeByte = 10; // byte: Inteiro minúsculo (-128 a 127). Focado em economizar memória.
        short idadeShort = 10; // short: Inteiro pequeno (até ~32 mil). Raramente usado hoje em dia.
        long numeroGrande = 10000000; // long: Inteiro gigante. Obrigatório colocar 'L' no final. Usado em IDs ou datas.

        // --- NÚMEROS DECIMAIS (Com casa decimal) ---
        double salarioDouble = 2000; // // double: Decimal padrão. O mais usado para números quebrados e cálculos
        float salarioFloat = 2500.0F; //  float: Decimal mais leve. Obrigatório colocar 'f' no final. Menos preciso.

        // --- OUTROS ---
        boolean verdadeiro = true; // boolean: Só aceita true (verdadeiro) ou false (falso). Base da lógica.
        boolean falso = false; // boolean: Só aceita true (verdadeiro) ou false (falso). Base da lógica.
        char caractere = 'M'; // char: Guarda apenas UM caractere. Obrigatório usar aspas simples (' ').

        //String
        String nome = "Ruan";

        System.out.println("The user's age is " + age + " years "+ "A idade do fulho do usuario é " + ageSon + " years");
        System.out.println(numeroGrande);
        System.out.println("o nome do usuário é " + nome);
    }
}