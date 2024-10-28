import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que representa um Livro.
 */
public class Livro {

    /**
     * Identificador único do livro.
     */
    private int id;

    /**
     * Contador estático para gerar IDs únicos para os livros.
     */
    private static int contadorLivro = 0;

    /**
     * Nome do livro.
     */
    private String nome;

    /**
     * Preço do livro.
     */
    private double preco;

    /**
     * Data de publicação do livro.
     */
    private Date publicacao;

    /**
     * Autor do livro.
     */
    private Autor autor;

    /**
     * Construtor que inicializa um livro com nome e preço.
     *
     * @param nome  Nome do livro.
     * @param preco Preço do livro.
     */
    public Livro(String nome, double preco) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Construtor que inicializa um livro com nome, preço e autor.
     *
     * @param nome  Nome do livro.
     * @param preco Preço do livro.
     * @param autor Autor do livro.
     */
    public Livro(String nome, double preco, Autor autor) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    /**
     * Construtor que inicializa um livro com nome, preço e data de publicação.
     *
     * @param nome        Nome do livro.
     * @param preco       Preço do livro.
     * @param publication Data de publicação do livro no formato "dd/MM/yyyy".
     */
    public Livro(String nome, double preco, String publication) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        setPublicacao(publication);
    }

    /**
     * Construtor que inicializa um livro com nome, preço, data de publicação e autor.
     *
     * @param nome        Nome do livro.
     * @param preco       Preço do livro.
     * @param publication Data de publicação do livro no formato "dd/MM/yyyy".
     * @param autor       Autor do livro.
     */
    public Livro(String nome, double preco, String publication, Autor autor) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        setPublicacao(publication);
        this.autor = autor;
    }

    /**
     * Obtém o ID do livro.
     *
     * @return ID do livro.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome do livro.
     *
     * @return Nome do livro.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do livro.
     *
     * @param nome Nome do livro.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o preço do livro.
     *
     * @return Preço do livro.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do livro.
     *
     * @param preco Preço do livro.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Define o autor do livro.
     *
     * @param autor Autor do livro.
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Obtém o autor do livro.
     *
     * @return Autor do livro.
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Obtém a data de publicação do livro.
     *
     * @return Data de publicação do livro.
     */
    public Date getPublicacao() {
        return publicacao;
    }

    /**
     * Define a data de publicação do livro.
     *
     * @param publication Data de publicação no formato "dd/MM/yyyy".
     */
    public void setPublicacao(String publication) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.publicacao = dateFormat.parse(publication);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retorna uma representação em string do livro.
     *
     * @return String representando o livro.
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String publicacaoFormatado = (publicacao != null) ? dateFormat.format(publicacao) : "Data não disponível";
        return "Livro" + id + "{nome=" + nome +
                ", preco=" + preco +
                ", publicacao=" + publicacaoFormatado +
                ", autor=" + (autor != null ? autor.getNome() : "Autor não disponível") +
                '}';
    }
}