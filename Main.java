public class Main {
    public static void main(String[] args) {
        Funcionario tosador = new Funcionario("Zé da Tosa", "Tosa");
        Funcionario banhista = new Funcionario("Maria do Banho", "Banho");

        tosador.mostrarDados();
        banhista.mostrarDados();

        System.out.println("\n--- AGENDAMENTO SIMPLES ---");
        String servicoSolicitado = "Tosa";

        if (tosador.getFuncao().equals(servicoSolicitado)) {
            System.out.println(tosador.getNome() + " vai realizar a tosa!");
        } else {
            System.out.println("Funcionário não encontrado para este serviço");
        }
    }
}