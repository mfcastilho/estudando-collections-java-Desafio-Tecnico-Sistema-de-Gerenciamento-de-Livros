# Desafio Técnico: Sistema de Gerenciamento de Livros

Você foi contratado para desenvolver um sistema de gerenciamento de livros para uma biblioteca. O sistema deve ser capaz de armazenar informações sobre os livros, autores e categorias. Além disso, ele deve permitir que os usuários realizem operações como adicionar livros, listar todos os livros, listar livros por autor, listar livros por categoria e buscar livros por título.

## Requisitos

- [X] Crie as classes `biblioteca.Livro`, `biblioteca.Autor` e `biblioteca.Categoria`, cada uma com os campos relevantes para sua descrição. Certifique-se de incluir construtores, getters e setters.

  **Classe `biblioteca.Livro`:**
  - Título (String): O título do livro.
  - biblioteca.Autor (biblioteca.Autor): O autor do livro.
  - biblioteca.Categoria (biblioteca.Categoria): A categoria à qual o livro pertence.
  - Ano de Publicação (int): O ano em que o livro foi publicado.
  - ISBN (String): O número de identificação único do livro.
  - Sinopse (String): Uma breve descrição do enredo do livro.

  **Classe `biblioteca.Autor`:**
  - Nome (String): O nome do autor.
  - Data de Nascimento (String ou LocalDate): A data de nascimento do autor.
  - País de Origem (String): O país de origem do autor.
  - Bibliografia (String): Uma lista de obras notáveis escritas pelo autor.

  **Classe `biblioteca.Categoria`:**
  - Nome (String): O nome da categoria.
  - Descrição (String): Uma breve descrição da categoria.

- [X] Crie uma classe `biblioteca.Biblioteca` que conterá coleções para armazenar os objetos de livros, autores e categorias.

- [ ] Implemente os seguintes métodos na classe `biblioteca.Biblioteca`:
  - [X] `adicionarLivro(biblioteca.Livro livro)`: Adiciona um livro à coleção.
  - [X] `listarLivros()`: Lista todos os livros da biblioteca.
  - [ ] `listarLivrosPorAutor(biblioteca.Autor autor)`: Lista os livros escritos por um autor específico.
  - [ ] `listarLivrosPorCategoria(biblioteca.Categoria categoria)`: Lista os livros de uma categoria específica.
  - [ ] `buscarLivroPorTitulo(String titulo)`: Retorna um livro com o título correspondente, ou null se não for encontrado.

## Instruções

- [ ] Crie um pacote chamado `biblioteca` para organizar suas classes.

- [ ] Utilize as classes de coleções apropriadas do Java, como `ArrayList`, `HashMap` ou outras, para armazenar os objetos.

- [ ] Crie um programa principal que demonstre o funcionamento do sistema. Nele, crie instâncias de livros, autores e categorias, adicione os livros à biblioteca e teste os diferentes métodos de busca e listagem.

- [ ] Certifique-se de que o código seja legível e bem estruturado. Utilize comentários para explicar partes importantes do código.

- [ ] Ao concluir o desafio, tente otimizar seu código e considerar como ele poderia ser expandido no futuro, por exemplo, adicionando mais funcionalidades ou melhorando a interface do usuário.

Lembre-se de que este desafio tem como objetivo ajudá-lo a praticar o uso de coleções em Java. Sinta-se à vontade para personalizar ou expandir o desafio conforme desejar. Boa sorte e divirta-se programando!
