package biblioteca.core.model;

import biblioteca.core.util.LivroNaoEncontradoException;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    private String isnb;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if(this.isDisponivel()) {
            this.setDisponivel(false);
        }
    }

    public void devolver() {
        if(!this.isDisponivel()) {
            this.setDisponivel(true);
        } else{
            throw new LivroNaoEncontradoException("Livro não encontrado doidaooo");
        }
    }

}
