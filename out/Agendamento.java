package Petshop;

public class Agendamento {
    private Cliente cliente;
    private String servico;
    private String dia;
    private String horario;
    private String funcionario;
    private String sala;

    public Agendamento(Cliente cliente, String servico, String dia, String horario, String funcionario) {
        this.cliente = cliente;
        this.servico = servico.toUpperCase();
        this.dia = dia;
        this.horario = horario;
        this.funcionario = funcionario;

        switch (this.servico) {
            case "BANHO":
                this.sala = "Sala de Banho";
                break;
            case "TOSA":
                this.sala = "Sala de Tosa";
                break;
            case "VETERINARIO":
                this.sala = "Clínica";
                break;
            default:
                throw new IllegalArgumentException("Serviço inválido");
        }

        if (!horarioValido(horario)) {
            throw new IllegalArgumentException("Horário fora do expediente ou no intervalo");
        }
    }

    private boolean horarioValido(String horario) {
        String[] partes = horario.split(":");
        int hora = Integer.parseInt(partes[0]);
        return (hora >= 8 && hora < 12) || (hora >= 14 && hora < 18);
    }

    public String getServico() { return servico; }
    public String getSala() { return sala; }
    public String getDia() { return dia; }
    public String getHorario() { return horario; }

    public String getResumo() {
        return "Agendamento:\n" +
               "Cliente: " + cliente.getNome() + "\n" +
               "Animal: " + cliente.getNomeAnimal() + " (" + cliente.getTipoAnimal() + ")\n" +
               "Serviço: " + servico + "\n" +
               "Sala: " + sala + "\n" +
               "Dia: " + dia + "\n" +
               "Horário: " + horario + "\n" +
               "Funcionário: " + funcionario + "\n";
    }
}
