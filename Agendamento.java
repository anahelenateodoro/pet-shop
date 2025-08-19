import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Espaco {
    private String nome;
    private String tipo; 
    private List<Agendamento> agendamentos;

    public Espaco(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.agendamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Agendamento> getAgendamentos() {
        return new ArrayList<>(agendamentos);
    }


    public boolean estaDisponivel(LocalDateTime inicio, int duracaoMinutos) {
        LocalDateTime fim = inicio.plusMinutes(duracaoMinutos);

        for (Agendamento ag : agendamentos) {
            LocalDateTime agInicio = ag.getDataHora();
            LocalDateTime agFim = agInicio.plusMinutes(ag.getServico().getDuracaoServicoMinutos());

        
            if (!(fim.isBefore(agInicio) || inicio.isAfter(agFim))) {
                return false;
            }
        }
        return true;
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }
}
