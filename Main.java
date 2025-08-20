import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Cria cliente e pet
        Cliente cliente1 = new Cliente(1, "João da Silva", "123.456.789-00");
        Pet pet1 = new Pet("Cachorro", "Lilica", "Poodle", 3, "Médio");
        cliente1.adicionarPet(pet1);

        // Cria funcionários
        Atendente atendente = new Atendente("Maria Atendente", 2000.0);
        Groomer groomer = new Groomer("Carlos Groomer", 2500.0);
        Administrador admin = new Administrador("Fernanda Admin", 3000.0);

        // Cria os espaços
        Espaco salaBanho = new Espaco("Sala 1", "Banho");
        Espaco salaTosa = new Espaco("Sala 2", "Tosa");

        // Cria os serviços
        Servico banho = new Servico("Banho", "Banho Completo", 30, 50.0, "Groomer", "Banho");
        Servico tosa = new Servico("Tosa", "Tosa Higiênica", 40, 70.0, "Groomer", "Tosa");

        // Cria agendamento
        LocalDateTime dataHora = LocalDateTime.of(2025, 8, 20, 10, 0);

        Agendamento agendamento1 = new Agendamento(
                cliente1,
                pet1,
                groomer,   // Funcionário responsável
                salaBanho, // Espaço
                banho,     // Serviço
                dataHora   // Data e hora
        );

        // Atendente confirma o agendamento 
        atendente.agendarServico(agendamento1);

        // Exibir resumo do cliente 
        System.out.println("\n--- Resumo Cliente ---");
        System.out.println(cliente1);

        // Mostrar agendamento
        System.out.println("\n--- Detalhes do Agendamento ---");
        System.out.println(agendamento1);

        // Admin gera relatório
        admin.gerarRelatorio("Agenda do dia");
    }
}
