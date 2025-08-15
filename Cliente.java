import java.util.Arrays;

public class Cliente {

    private int idCliente;
    private String nome;
    private String cpf;
    private Pet[] pets;
    private int numeroDePets;

    // Construtor principal - Inicia com uma capacidade inicial para 5 pets.
    public Cliente(int idCliente, String nome, String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
        }
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.pets = new Pet[5]; // Começar com um tamanho menor pode ser mais eficiente
        this.numeroDePets = 0;
    }

    // Construtor sobrecarregado que já recebe pets iniciais.
    public Cliente(int idCliente, String nome, String cpf, Pet[] petsIniciais) {
        this(idCliente, nome, cpf); // Reutiliza a lógica do construtor principal.

        for (Pet pet : petsIniciais) { // Usando um "for-each" que é mais limpo
            this.adicionarPet(pet);
        }
    }

    /**
     * Adiciona um pet ao cliente. Se o vetor estiver cheio,
     * ele é redimensionado automaticamente para o dobro da capacidade.
     */
    public void adicionarPet(Pet pet) {
        if (pet == null) {
            return; // Não adiciona pets nulos.
        }

        // 1. MELHORIA: Lógica de redimensionamento simplificada
        if (numeroDePets >= this.pets.length) {
            System.out.println("Vetor cheio. Redimensionando...");
            // Arrays.copyOf cria um novo vetor com o novo tamanho e já copia todos os elementos.
            // É mais eficiente e limpo que o loop manual.
            int novaCapacidade = this.pets.length * 2;
            this.pets = Arrays.copyOf(this.pets, novaCapacidade);
        }

        // Adiciona o pet na posição correta
        this.pets[numeroDePets] = pet;
        this.numeroDePets++;
    }

    /**
     * 2. NOVA FUNCIONALIDADE: Busca um pet pelo nome.
     * @param nomeDoPet O nome do pet a ser buscado.
     * @return O objeto Pet se encontrado, ou null se não existir.
     */
    public Pet buscarPetPorNome(String nomeDoPet) {
        for (int i = 0; i < numeroDePets; i++) {
            if (this.pets[i].getNome().equalsIgnoreCase(nomeDoPet)) {
                return this.pets[i];
            }
        }
        return null; // Retorna null se não encontrar o pet
    }

    /**
     * 3. NOVA FUNCIONALIDADE: Remove um pet pelo nome.
     * @param nomeDoPet O nome do pet a ser removido.
     * @return true se o pet foi removido com sucesso, false caso contrário.
     */
    public boolean removerPet(String nomeDoPet) {
        int indiceParaRemover = -1;
        // Primeiro, encontra o índice do pet que queremos remover
        for (int i = 0; i < numeroDePets; i++) {
            if (this.pets[i].getNome().equalsIgnoreCase(nomeDoPet)) {
                indiceParaRemover = i;
                break; // Encontrou o pet, pode parar o loop
            }
        }

        // Se o pet foi encontrado (índice é válido)
        if (indiceParaRemover != -1) {
            // "Puxa" todos os elementos da direita para a esquerda, cobrindo a posição removida
            for (int i = indiceParaRemover; i < numeroDePets - 1; i++) {
                this.pets[i] = this.pets[i + 1];
            }
            // Decrementa o contador de pets
            this.numeroDePets--;
            // Limpa a última posição que ficou duplicada (opcional, mas boa prática)
            this.pets[numeroDePets] = null;
            return true; // Sucesso
        }

        return false; // Pet não encontrado
    }

    // Getters permanecem os mesmos
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
                // AGORA UTILIZANDO TODOS OS DADOS DO PET
                sb.append(" - Nome: ").append(pet.getNome())
                        .append(" | Espécie: ").append(pet.getEspecie())
                        .append(" | Raça: ").append(pet.getRaca())
                        .append(" | Idade: ").append(pet.getIdade()) // <-- USADO AQUI
                        .append(" | Porte: ").append(pet.getPorte()) // <-- USADO AQUI
                        .append("\n");
            }
        }
        return sb.toString();
    }
}