package biblioteca.core.model;

import biblioteca.core.util.statusEmprestimos;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private statusEmprestimos status;

    public Emprestimo(Livro livro, Usuario usuario){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.status = statusEmprestimos.ATIVO;
    }

    public void devolver() {
        this.status = statusEmprestimos.DEVOLVIDO;
        livro.devolver();
        this.dataDevolucao = LocalDate.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public statusEmprestimos getStatus() {
        return status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return usuario.getNome() + " -> " + livro.getTitulo() + " | " + status;
    }
}
