package biblioteca.ui;

import biblioteca.core.model.Aluno;
import biblioteca.core.model.Livro;
import biblioteca.core.model.Usuario;
import biblioteca.core.repository.LivroRepository;
import biblioteca.core.service.EmprestimoService;

public class Teste {
    public static void main(String[] args){
        LivroRepository repo = new LivroRepository();
        EmprestimoService service = new EmprestimoService();

        Livro livro1 = new Livro("Moises","Java para iniciantes");
        Livro livro2 = new Livro("Creusa","Inicio em PHP");
        Usuario user = new Aluno("34564564541","Gabriel",54);
        repo.adicionar(livro1);
        repo.adicionar(livro2);

        service.emprestarLivro(user,livro1);
        service.listarEmprestimos();
    }
}
