import java.time.LocalDateTime;

public class Agendamento {
    private Cliente cliente;
    private Pet pet;
    private Funcionario funcionario;
    private Espaco espaco;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento(Cliente cliente, Pet pet, Funcionario funcionario, Espaco espaco, Servico servico, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.pet = pet;
        this.funcionario = funcionario;
        this.espaco = espaco;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public Servico getServico() {
        return servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getResumo() {
        return "Agendamento:\n" +
               "Cliente: " + cliente.getNome() + "\n" +
               "Pet: " + pet.getNome() + "\n" +
               "Serviço: " + servico.getCategoria() + "\n" +
               "Funcionário: " + funcionario.getNome() + "\n" +
               "Espaço: " + espaco.getNome() + "\n" +
               "Data/Hora: " + dataHora;
    }

    @Override
    public String toString() {
        return getResumo();
    }
}
