package semana07;

public class PersistePJ {

	public static void main(String[] args) {
		
		PessoaJuridicaPersistente p = new PessoaJuridicaPersistente();
		p.cnpj = "123";
		p.id = 1;
		p.inscricao = "456";
		p.nome = "Pepsi";
		
		System.out.println(p.gravar());
		
		PessoaJuridica pj = PessoaJuridicaPersistente.ler("123");
		System.out.println(pj.id);
		System.out.println(pj.nome);
		System.out.println(pj.cnpj);
		System.out.println(pj.inscricao);
		
	}

}
