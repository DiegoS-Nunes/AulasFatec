/**
 * Classe Imagem representa uma imagem com um identificador único, nome e descrição.
 */
public class Imagem {

    /**
     * Identificador único da imagem.
     */
    private int id;

    /**
     * Contador estático para gerar identificadores únicos.
     */
    private static int contador = 0;

    /**
     * Nome da imagem.
     */
    private String nome;

    /**
     * Descrição da imagem.
     */
    private String descricao;

    /**
     * Construtor padrão que inicializa a imagem com um identificador único.
     */
    public Imagem() {
        this.id = ++contador;
    }

    /**
     * Construtor que inicializa a imagem com um identificador único e um nome.
     * 
     * @param nome Nome da imagem.
     */
    public Imagem(String nome) {
        this.id = ++contador;
        this.nome = nome;
    }

    /**
     * Construtor que inicializa a imagem com um identificador único, nome e descrição.
     * 
     * @param nome Nome da imagem.
     * @param descricao Descrição da imagem.
     */
    public Imagem(String nome, String descricao) {
        this.id = ++contador;
        this.nome = nome;
        this.descricao = descricao;
    }

    /**
     * Retorna o identificador único da imagem.
     * 
     * @return Identificador único da imagem.
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o nome da imagem.
     * 
     * @return Nome da imagem.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da imagem.
     * 
     * @param nome Nome da imagem.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição da imagem.
     * 
     * @return Descrição da imagem.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição da imagem.
     * 
     * @param descricao Descrição da imagem.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna uma representação em string da imagem.
     * 
     * @return Representação em string da imagem.
     */
    @Override
    public String toString() {
        return "Imagem" + id + 
        " {nome=" + nome + 
        ", descricao=" + descricao +
        "}";
    }
}