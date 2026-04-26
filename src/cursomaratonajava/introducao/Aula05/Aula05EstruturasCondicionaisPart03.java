package cursomaratonajava.introducao.Aula05;

public class Aula05EstruturasCondicionaisPart03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais pro DevDojo";
        String mensagemNaoDoar = "Nao vou doar 500 pro DevDojo";
        //Sintaxe operadro ternario  (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
