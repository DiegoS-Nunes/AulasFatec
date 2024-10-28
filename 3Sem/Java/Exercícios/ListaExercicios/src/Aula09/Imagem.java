public class Imagem{
    private int id;
    private static int contador=0;
    private String nome;
    private String descricao;

    public Imagem() {
        this.id = ++contador;
    }

    public Imagem(String nome) {
        this.id = ++contador;
        this.nome = nome;
    }

    public Imagem(String nome, String descricao) {
        this.id = ++contador;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Imagem" + id + 
        " {nome=" + nome + 
        ", descricao=" + descricao +
        "}";
    }
}