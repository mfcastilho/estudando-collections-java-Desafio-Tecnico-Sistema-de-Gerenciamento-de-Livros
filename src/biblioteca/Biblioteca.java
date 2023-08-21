package biblioteca;

import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Categoria> categorias;

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }


}
