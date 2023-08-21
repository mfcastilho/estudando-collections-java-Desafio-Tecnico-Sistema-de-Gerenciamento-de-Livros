package biblioteca;

import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Categoria> categorias;

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        System.out.println("Lista de Livros da Biblioteca:");
        for(Livro livro: livros){
            System.out.println(livro.toString());
        }
    }


}
