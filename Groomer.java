public class Groomer extends Funcionario {

    public Groomer(String nome, double salario) {
        super(nome, salario, "Groomer");
    }

    @Override
    public void realizarServico(Servico servico, Pet pet) {
        System.out.println(nome + " está realizando o serviço: " + servico.getCategoria() +
                " no pet: " + pet.getNome());
    }
}
