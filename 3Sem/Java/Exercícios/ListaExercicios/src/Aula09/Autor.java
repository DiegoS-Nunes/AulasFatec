import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que representa um Autor.
 */
public class Autor {

    /**
     * Identificador único do autor.
     */
    private int id;

    /**
     * Contador estático para gerar IDs únicos para cada autor.
     */
    private static int contadorAutor = 0;

    /**
     * Nome do autor.
     */
    private String nome;

    /**
     * Data de nascimento do autor.
     */
    private Date nascimento;

    /**
     * Nacionalidade do autor.
     */
    private String nacionalidade;

    /**
     * Construtor que inicializa o autor com um nome.
     *
     * @param nome Nome do autor.
     */
    public Autor(String nome) {
        this.id = ++contadorAutor;
        this.nome = nome;
    }

    /**
     * Construtor que inicializa o autor com um nome e data de nascimento.
     *
     * @param nome Nome do autor.
     * @param birthday Data de nascimento do autor no formato "dd/MM/yyyy".
     */
    public Autor(String nome, String birthday) {
        this.id = ++contadorAutor;
        this.nome = nome;
        setNascimento(birthday);
    }

    /**
     * Construtor que inicializa o autor com um nome, data de nascimento e nacionalidade.
     *
     * @param nome Nome do autor.
     * @param birthday Data de nascimento do autor no formato "dd/MM/yyyy".
     * @param nacionalidade Nacionalidade do autor.
     */
    public Autor(String nome, String birthday, String nacionalidade) {
        this.id = ++contadorAutor;
        this.nome = nome;
        setNascimento(birthday);
        this.nacionalidade = nacionalidade;
    }

    /**
     * Obtém o identificador único do autor.
     *
     * @return ID do autor.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome do autor.
     *
     * @return Nome do autor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do autor.
     *
     * @param nome Nome do autor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a data de nascimento do autor.
     *
     * @return Data de nascimento do autor.
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * Define a data de nascimento do autor.
     *
     * @param birthday Data de nascimento no formato "dd/MM/yyyy".
     */
    public void setNascimento(String birthday) {
        if (birthday == null || birthday.trim().isEmpty()) {
            this.nascimento = null;
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.nascimento = dateFormat.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Obtém a nacionalidade do autor.
     *
     * @return Nacionalidade do autor.
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define a nacionalidade do autor.
     *
     * @param nacionalidade Nacionalidade do autor.
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * Retorna uma representação em string do autor.
     *
     * @return String representando o autor.
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final String nascimentoFormatado = (nascimento != null) ? dateFormat.format(nascimento) : "Data não disponível";
        
        return "Autor" + id + "{nome='" + nome +
                ", nascimento=" + nascimentoFormatado +
                ", nacionalidade=" + nacionalidade +
                '}';
    }
}