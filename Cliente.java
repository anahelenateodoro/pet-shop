public class Cliente {
    private String nomeCliente;
    private String telefone;
    private String cpf;

    private String nomeAnimal;
    private String tipoAnimal;

    private String servico;   
    private String horario;   

    public Cliente(String nomeCliente, String telefone, String cpf,
                   String nomeAnimal, String tipoAnimal,
                   String servico, String horario) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.cpf = cpf;
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.servico = servico;
        this.horario = horario;
    }

    public String getDados() {
        return "===== Cadastro do Cliente =====\n" +
               "Nome: " + nomeCliente + "\n" +
               "Telefone: " + telefone + "\n" +
               "CPF: " + cpf + "\n" +
               "Animal: " + nomeAnimal + " (" + tipoAnimal + ")\n" +
               "Serviço: " + servico + "\n" +
               "Horário: " + horario + "\n";
    }
}
