package biblioteca.core.repository;

import biblioteca.core.model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroRepository {
    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public Optional<Livro> buscarISBN(String isbn){
        return livros.stream().filter(l -> l.getIsnb().equals(isbn)).findFirst();
    }

    public List<Livro> listarTodos(){
        return livros;
    }
}
