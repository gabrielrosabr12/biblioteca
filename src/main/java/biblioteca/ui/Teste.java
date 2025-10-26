package biblioteca.ui;

import biblioteca.core.model.Livro;
import biblioteca.core.model.Usuario;

public class Teste {
    public static void main(String[] args){
        Livro livro1 = new Livro("Moises","Java para iniciantes");
        Livro livro2 = new Livro("Ana Beatriz","Fisioterapia dos bons");
        Usuario user = new Usuario("10953357740","Gabriel");

        user.pegarEmprestado(livro1);
        user.pegarEmprestado(livro2);
        System.out.println(user.getLivros());
        user.devolverLivro("Java para iniciantes");
        System.out.println(user.getLivros());
    }
}
