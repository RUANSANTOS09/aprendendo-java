package cursomaratonajava.introducao.ExerciciosIntroducao;
/*
prática
crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Ruan";
        String endereco = "Fazenda Mamona";
        double salario = 6990.75;
        String dataRecebimentoSalario = "15/04/26"; //Dê nomes autoexplicativos às suas variáveis.
        String relatorioRecibodeSalario = "Eu "+ nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorioRecibodeSalario);
    }
}
