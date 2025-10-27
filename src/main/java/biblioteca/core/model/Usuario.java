package biblioteca.core.model;


import java.util.Iterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private int id;
    Set<Livro> livros = new HashSet<>();
    private int limiteEmprestimos;

    public Usuario(String cpf, String nome,int limiteEmprestimos,int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.limiteEmprestimos = limiteEmprestimos;
        this.id = id;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public abstract void mostrarTipo();

    public void setLimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
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
