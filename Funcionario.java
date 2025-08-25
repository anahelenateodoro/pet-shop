public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected String perfil;  // Ex: "Atendente", "Groomer", "Administrador"

    public Funcionario(String nome, double salario, String perfil) {
        this.nome = nome;
        this.salario = salario;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public abstract void realizarServico(Servico servico, Pet pet);


    public boolean podeGerarRelatorio() {
        return perfil.equalsIgnoreCase("Administrador");
    }

    public boolean podeAgendar() {
        return perfil.equalsIgnoreCase("Atendente") || perfil.equalsIgnoreCase("Administrador");
    }
}