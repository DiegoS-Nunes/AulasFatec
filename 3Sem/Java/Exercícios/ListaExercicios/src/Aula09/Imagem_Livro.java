/**
 * Classe Imagem_Livro representa a associação entre uma imagem e um livro.
 * Cada instância desta classe possui um identificador único, uma imagem e um livro.
 */
public class Imagem_Livro {

    /**
     * Identificador único da associação Imagem_Livro.
     */
    private int id;

    /**
     * Contador estático para gerar identificadores únicos.
     */
    private static int contador = 0;

    /**
     * Imagem associada ao livro.
     */
    private Imagem imagem;

    /**
     * Livro associado à imagem.
     */
    private Livro livro;

    /**
     * Construtor da classe Imagem_Livro.
     * Incrementa o contador e define a imagem e o livro associados.
     *
     * @param imagem A imagem a ser associada.
     * @param livro O livro a ser associado.
     */
    public Imagem_Livro(Imagem imagem, Livro livro) {
        this.id = ++contador;
        this.imagem = imagem;
        this.livro = livro;
    }

    /**
     * Retorna o identificador único da associação Imagem_Livro.
     *
     * @return O identificador único.
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna a imagem associada ao livro.
     *
     * @return A imagem associada.
     */
    public Imagem getImagem() {
        return imagem;
    }

    /**
     * Define uma nova imagem para a associação.
     *
     * @param imagem A nova imagem a ser associada.
     */
    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    /**
     * Retorna o livro associado à imagem.
     *
     * @return O livro associado.
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * Define um novo livro para a associação.
     *
     * @param livro O novo livro a ser associado.
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * Retorna uma representação em string da associação Imagem_Livro.
     * Inclui o identificador, a descrição da imagem e o nome do livro.
     *
     * @return Uma string representando a associação Imagem_Livro.
     */
    @Override
    public String toString() {
        return "Imagem_Livro" + id +
                "{imagem=" + imagem.getDescricao() +
                ", livro=" + livro.getNome() +
                '}';
    }
}
