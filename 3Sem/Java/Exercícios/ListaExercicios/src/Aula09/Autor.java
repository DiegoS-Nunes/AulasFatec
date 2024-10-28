import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Autor {
    private int id;
    private static int contadorAutor = 0;
    private String nome;
    private Date nascimento;
    private String nacionalidade;

    public Autor(String nome) {
        this.id = ++contadorAutor;
        this.nome = nome;
    }

    public Autor(String nome, String birthday) {
        this.id = ++contadorAutor;
        this.nome = nome;
        setNascimento(birthday);
    }

    public Autor(String nome, String birthday, String nacionalidade) {
        this.id = ++contadorAutor;
        this.nome = nome;
        setNascimento(birthday);
        this.nacionalidade = nacionalidade;
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

    public Date getNascimento() {
        return nascimento;
    }

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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

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