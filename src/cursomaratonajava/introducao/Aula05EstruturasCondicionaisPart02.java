package cursomaratonajava.introducao;

public class Aula05EstruturasCondicionaisPart02 {
    public static void main(String[] args) {
        // age < 15 categoria infantil
        // age >= 15 && idade < 18 categoria juvenil
        // age >= 18 categoria adulto
        int ageJogador = 8;
        String categoria;
        if (ageJogador < 15){
            categoria = "Categoria Infantil";
        } else if (ageJogador >= 15 && ageJogador < 18) {
            categoria = "Categoria Juvenil";;
        } else{
            categoria = "Categoria Adulto";;
        }
        System.out.println(categoria);
    }
}
