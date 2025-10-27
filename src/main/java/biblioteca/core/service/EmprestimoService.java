package biblioteca.core.service;

import java.util.List;
import java.util.ArrayList;

import biblioteca.core.model.Emprestimo;
import biblioteca.core.model.Livro;
import biblioteca.core.model.Usuario;
import biblioteca.core.util.LimiteEmprestimosException;
import biblioteca.core.util.statusEmprestimos;

public class EmprestimoService {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestarLivro(Usuario usuario, Livro livro){
        long qtd = emprestimos.stream().filter(e -> e.getUsuario().equals(usuario) && e.getStatus() == statusEmprestimos.ATIVO).count();

        if (qtd >= usuario.getLimiteEmprestimos()) {
            throw new LimiteEmprestimosException("Usuario atingiu o limite de empréstimos");
        }

        livro.emprestar();
        Emprestimo e = new Emprestimo(livro,usuario);
        emprestimos.add(e);
    }

    public void devolverLivro(Emprestimo e) {
        e.devolver();
    }

    public void listarEmprestimos(){
        emprestimos.forEach(System.out::println);
    }

}
