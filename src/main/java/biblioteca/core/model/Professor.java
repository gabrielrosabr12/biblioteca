package biblioteca.core.model;

public class Professor extends Usuario{
    public Professor(String cpf,String nome,int id){
        super(cpf,nome,6,id);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Professor");
    }
}
