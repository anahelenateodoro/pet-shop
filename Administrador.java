public class Administrador extends Funcionario{
    public Administrador(String nome, double salario) {
        super(nome, salario, "Administrador");
    }

    @Override
    public void realizarServico(Servico servico, Pet pet) {
        System.out.println(nome + " não realiza serviços, mas gerencia o sistema.");
    }

    public void gerarRelatorio(String tipo) {
        System.out.println(nome + " gerou o relatório do tipo: " + tipo);
    }
}
