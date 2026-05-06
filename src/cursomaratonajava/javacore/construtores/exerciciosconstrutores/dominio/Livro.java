package cursomaratonajava.javacore.construtores.exerciciosconstrutores.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String editora;
    {
        System.out.println("[Livro] Objeto instanciado");
    }

    public Livro(){
        System.out.println("Construtor padrão chamado");
    }
    public Livro(String titulo, String autor, int anoPublicacao){
        this(titulo,autor,anoPublicacao,0,"Sem Editora");
    }

    public Livro(String titulo,String autor,int anoPublicacao,int numeroPaginas,String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }

    public void exibir(){
        System.out.println(this.titulo = titulo);
        System.out.println(this.autor = autor);
        System.out.println(this.anoPublicacao = anoPublicacao);
        System.out.println(this.numeroPaginas = numeroPaginas);
        System.out.println(this.editora = editora);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }
}
