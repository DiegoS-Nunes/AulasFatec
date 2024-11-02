package semana06;

public class TerminalBancario {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.titular = "Jonas";
		//conta1.titular = "J0n@s";
		System.out.println(conta1.depositar(1000));
		//System.out.println(conta1.depositar(-10));
		//System.out.println(conta1.depositar(9));
		System.out.println(conta1.consultar());
		
		System.out.println(conta1.sacar(1));
		System.out.println(conta1.sacar(500));
		System.out.println(conta1.sacar(800));
		System.out.println(conta1.consultar());
		ContaBancaria conta2 = new ContaBancaria();
		conta2.depositar(5000);
		
		ContaBancaria.realizarPix(conta2, conta1, 500);
		System.out.println(conta1.consultar());
		System.out.println(conta2.consultar());


	}

}
