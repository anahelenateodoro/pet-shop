public class Servico {
    //usando encapsulamento
    private String categoria;
    private String nome;
    private int duracaoServicoMinutos;
    private double preco;
    private String funcionarioPerfil;
    private String espacoUtilizado;

    public Servico(String categoria, String nome,int duracaoServicoMinutos, double preco, String funcionarioPerfil, String espacoUtilizado) {
        //tratamento de exceçao
        if(preco < 0){
            throw new IllegalArgumentException("O preco do serviço nao poder ser negativo");
        }

        if(duracaoServicoMinutos <= 0){
            throw new IllegalArgumentException("A duraçao do serviço deve ser maior que zero");
        }

        this.categoria = categoria;
        this.nome = nome;
        this.duracaoServicoMinutos = duracaoServicoMinutos;
        this.preco = preco;
        this.funcionarioPerfil = funcionarioPerfil;
        this.espacoUtilizado = espacoUtilizado;
    }

    //metodos e modificadores de acesso
    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoServicoMinutos() {
        return duracaoServicoMinutos;
    }

    public double getPreco() {
        return preco;
    }

    public String getFuncionarioPerfil() {
        return funcionarioPerfil;
    }

    public String getEspacoUtilizado() {
        return espacoUtilizado;
    }

}
