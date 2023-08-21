import biblioteca.Autor;
import biblioteca.Biblioteca;
import biblioteca.Categoria;
import biblioteca.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("E o Vento Levou", new Autor("Margaret Mitchell", LocalDate.of(1900,8,11), "Estados Unidos", "Margaret Munnerlyn Mitchell nasceu em 8 de novembro de 1900, em Atlanta."), new Categoria("Drama", "A categoria de livros que abordam temas emocionais e intensos, muitas vezes explorando conflitos pessoais, sociais e psicológicos dos personagens. Esses livros costumam oferecer uma visão profunda das emoções humanas e das complexidades das relações interpessoais."), 1936, "0-446-36538-6", "Scarlett O'Hara é uma jovem mimada que consegue tudo o que quer. No entanto, algo falta em sua vida: o amor de Ashley Wilkes, um nobre sulista que deve se casar com a sua prima Melanie. Tudo muda quando a Guerra Civil americana explode e Scarlett precisa lutar para sobreviver e manter a fazenda da família."));
        biblioteca.adicionarLivro(new Livro("O Alquimista", new Autor("Paulo Coelho", LocalDate.of(1947, 8, 24), "Brasil", "Paulo Coelho (1947) é um escritor brasileiro, autor de romances, ficção, investigação policial, temas místicos e autoajuda, é um dos autores mais vendidos no mundo. Foi eleito para a cadeira n.º 21 da Academia Brasileira de Letras."), new Categoria("Romance", "A categoria de livros que exploram histórias de amor, paixão e relacionamentos interpessoais. Os livros de romance frequentemente retratam a jornada emocional dos personagens enquanto eles enfrentam desafios, obstáculos e dilemas em busca do amor verdadeiro."), 2017, "972-711-011-8", "O Alquimista relata as aventuras de Santiago, um jovem pastor andaluz que abandona a sua terra natal e viaja pelo Norte de África em busca de uma quimera — um tesouro enterrado sob as pirâmides. Uma cigana, um homem que diz ser rei e um alquimista irão ajudá-lo na sua busca."));

        biblioteca.listarLivros();

        biblioteca.listarLivrosPorAutor( new Autor("Paulo Coelho", LocalDate.of(1947, 8, 24), "Brasil", "Paulo Coelho (1947) é um escritor brasileiro, autor de romances, ficção, investigação policial, temas místicos e autoajuda, é um dos autores mais vendidos no mundo. Foi eleito para a cadeira n.º 21 da Academia Brasileira de Letras."));

    }
}
