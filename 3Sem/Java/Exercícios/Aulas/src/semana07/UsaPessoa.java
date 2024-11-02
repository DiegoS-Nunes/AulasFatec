package semana07;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(); //não instanciar
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Funcionario f = new Funcionario();
		//pj.digitar();
		//pj.mostrar();
		f.digitar();
		f.mostrar();
		
		
		pf.id = 1;
		pf.nome = "Pedro";
		pf.cpf = "123";
		pf.rg = "456";
		
		
	}

}
