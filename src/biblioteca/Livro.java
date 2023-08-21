package biblioteca;

public class Livro {
    private String titulo;
    private String autor;

    private Categoria categoria;
    private int anoDePublicacao;
    private String isbn;
    private String sinopse;

    public Livro(String titulo, String autor, Categoria categoria, int anoDePublicacao, String isbn, String sinopse){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoDePublicacao = anoDePublicacao;
        this.isbn = isbn;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria=" + categoria +
                ", anoDePublicacao=" + anoDePublicacao +
                ", isbn='" + isbn + '\'' +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
