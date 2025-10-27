package biblioteca.core.model;

public class Aluno extends Usuario{
    public Aluno (String cpf,String nome, int id){
        super(cpf,nome,3,id);
    }


    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Aluno");
    }
}
