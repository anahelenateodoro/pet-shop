class Pet {
    private String especie;
    private String nome;
    private String raca;
    private int idade;
    private String porte;

    public Pet(String especie, String nome,String raca, Integer idade, String porte) {
        this.especie = especie;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getPorte() {
        return porte;
    }

}