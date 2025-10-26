package biblioteca.core.model;


import java.util.Iterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Usuario {
    private String nome;
    private String cpf;
    Set<Livro> livros = new HashSet<>();

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<String> getLivros() {
        List<String> listLivros = livros.stream().map(Livro::getTitulo).sorted().toList();
        return listLivros;
    }

    public void pegarEmprestado(Livro livro) {
        this.livros.add(livro);
    }

    public void devolverLivro(String nomeLivro){
        Iterator<Livro> iterador = livros.iterator(); //Iterator objeto que percorre

        while(iterador.hasNext()) {
            Livro livro = iterador.next();
            if (livro.getTitulo().equals(nomeLivro)){
                iterador.remove(); // remove com segurança
                break;
            }

        };
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
