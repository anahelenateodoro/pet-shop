public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private String nomeAnimal;
    private String tipoAnimal;

    public Cliente(String nome, String telefone, String cpf, String nomeAnimal, String tipoAnimal) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getResumoCadastro() {
        return "===== Cadastro do Cliente =====\n" +
               "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "CPF: " + cpf + "\n" +
               "Nome do Animal: " + nomeAnimal + "\n" +
               "Tipo do Animal: " + tipoAnimal + "\n";
    }
}

