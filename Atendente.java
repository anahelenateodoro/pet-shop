public class Atendente extends Funcionario{
    public Atendente(String nome, double salario) {
        super(nome, salario, "Atendente");
    }

    @Override
    public void realizarServico(Servico servico, Pet pet) {
        System.out.println(nome + " não realiza serviços diretamente, apenas agenda.");
    }

    public void agendarServico(Agendamento agendamento) {
        System.out.println(nome + " agendou o serviço: " + agendamento.getServico().getCategoria() +
                " para o pet " + agendamento.getPet().getNome() +
                " no espaço " + agendamento.getEspaco().getNome() +
                " na data " + agendamento.getDataHora());
    }

    public void cancelarAgendamento(Agendamento agendamento) {
        System.out.println(nome + " cancelou o agendamento do serviço: " + agendamento.getServico().getCategoria());
    }
}
