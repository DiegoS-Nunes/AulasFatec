import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private int id;
    private static int contadorLivro = 0;
    private String nome;
    private double preco;
    private Date publicacao;
    private Autor autor;

    public Livro(String nome, double preco) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
    }

    public Livro(String nome, double preco, Autor autor) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public Livro(String nome, double preco, String publication) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        setPublicacao(publication);
    }

    public Livro(String nome, double preco, String publication, Autor autor) {
        this.id = ++contadorLivro;
        this.nome = nome;
        this.preco = preco;
        setPublicacao(publication);
        this.autor = autor;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publication) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.publicacao = dateFormat.parse(publication);
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String publicacaoFormatado = (publicacao != null) ? dateFormat.format(publicacao) : "Data não disponível";
        return "Livro" + id + "{nome=" + nome +
                ", preco=" + preco +
                ", publicacao=" + publicacaoFormatado  +
                ", autor=" + (autor != null ? autor.getNome() : "Autor não disponível") +
                '}';
    }
}