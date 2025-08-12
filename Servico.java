class Servico {
    private String categoria;
    private int duracaoServicoMinutos;

    public Servico(String categoria, int duracaoServicoMinutos) {
        this.categoria = categoria;
        this.duracaoServicoMinutos = duracaoServicoMinutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDuracaoServicoMinutos() {
        return duracaoServicoMinutos;
    }

}
