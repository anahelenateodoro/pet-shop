import java.util.Arrays;

public class Cliente {

    private int idCliente;
    private String nome;
    private String cpf;
    private Pet[] pets;
    private int numeroDePets;

    public Cliente(int idCliente, String nome, String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
        }
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.pets = new Pet[5];
        this.numeroDePets = 0;
    }

    public Cliente(int idCliente, String nome, String cpf, Pet[] petsIniciais) {
        this(idCliente, nome, cpf);

        for (Pet pet : petsIniciais) {
            this.adicionarPet(pet);
        }
    }

    public void adicionarPet(Pet pet) {
        if (pet == null) {
            return;
        }

        if (numeroDePets >= this.pets.length) {
            System.out.println("Vetor cheio. Redimensionando...");
            int novaCapacidade = this.pets.length * 2;
            this.pets = Arrays.copyOf(this.pets, novaCapacidade);
        }

        this.pets[numeroDePets] = pet;
        this.numeroDePets++;
    }

    public Pet buscarPetPorNome(String nomeDoPet) {
        for (int i = 0; i < numeroDePets; i++) {
            if (this.pets[i].getNome().equalsIgnoreCase(nomeDoPet)) {
                return this.pets[i];
            }
        }
        return null;
    }

    public boolean removerPet(String nomeDoPet) {
        int indiceParaRemover = -1;
        for (int i = 0; i < numeroDePets; i++) {
            if (this.pets[i].getNome().equalsIgnoreCase(nomeDoPet)) {
                indiceParaRemover = i;
                break; // Encontrou o pet, pode parar o loop
            }
        }

        if (indiceParaRemover != -1) {
            for (int i = indiceParaRemover; i < numeroDePets - 1; i++) {
                this.pets[i] = this.pets[i + 1];
            }
            this.numeroDePets--;
            this.pets[numeroDePets] = null;
            return true; // Sucesso
        }

        return false;
    }

    public Pet[] getPets() {
        return Arrays.copyOf(this.pets, this.numeroDePets);
    }
    public int getIdCliente() { return idCliente; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Cliente: ").append(nome).append(" (ID: ").append(idCliente).append(") =====\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("--- Pets (").append(numeroDePets).append(") ---\n");

        if (numeroDePets == 0) {
            sb.append("Nenhum pet cadastrado.\n");
        } else {
            for (int i = 0; i < numeroDePets; i++) {
                Pet pet = this.pets[i];
                sb.append(" - Nome: ").append(pet.getNome())
                        .append(" | Espécie: ").append(pet.getEspecie())
                        .append(" | Raça: ").append(pet.getRaca())
                        .append(" | Idade: ").append(pet.getIdade())
                        .append(" | Porte: ").append(pet.getPorte())
                        .append("\n");
            }
        }
        return sb.toString();
    }
}