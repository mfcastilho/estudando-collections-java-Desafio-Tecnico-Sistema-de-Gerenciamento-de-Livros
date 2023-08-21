package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Categoria> categorias;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        System.out.println("Lista de Livros da Biblioteca:");
        for(Livro livro: livros){
            System.out.println(livro.toString());
        }
    }

    public void listarLivrosPorAutor(Autor autor){

        List<Livro> livrosDoAutor = new ArrayList<>();

        for (Livro livro: livros){
            if(livro.getAutor().getNome().equals(autor.getNome())){
                livrosDoAutor.add(livro);
            }
        }

        System.out.println("Lista de livros do autor:"+ autor.getNome());
        for (Livro livro: livrosDoAutor){
            System.out.println(livro.getTitulo());
        }
    }


}
