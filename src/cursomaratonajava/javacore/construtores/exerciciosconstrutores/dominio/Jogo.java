package cursomaratonajava.javacore.construtores.exerciciosconstrutores.dominio;

public class Jogo {
    private String titulo;
    private String genero;
    private int anoLancamento;
    private String plataforma;
    private double nota;
    {
        System.out.println("[Jogo] Novo objeto sendo criado...");
    }

 public Jogo(){
     System.out.println("Construtor padrão chamado");
 }
public Jogo(String titulo,String genero,  int anoLancamento){
    this(titulo,genero,anoLancamento,0.0, "Desconhecido");
}

public Jogo(String titulo, String genero, int anoLancamento, double nota, String plataforma){

    this.titulo = titulo;
    this.genero = genero;
    this.anoLancamento = anoLancamento;
    this.plataforma = plataforma;
    this.nota = nota;
}
public void imprime(){
    System.out.println(this.titulo);
    System.out.println(this.genero);
    System.out.println(this.anoLancamento);
    System.out.println(this.nota);
    System.out.println(this.plataforma);
}

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAnoLancamento(int setanoLancamento){
        this.anoLancamento = setanoLancamento;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }
}
