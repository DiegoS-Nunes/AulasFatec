package semana06;

public class ContaBancaria {

	private final int VALOR_MAXIMO_SAQUE = 1000;
	private final int VALOR_MINIMO_SAQUE = 2;
	
	/*
	public ContaBancaria(double saldo) {
		// this.saldo = saldo; possível falha de segurança
		depositar(saldo); //regras de negócio
	}
	*/
	
	private double saldo;
	public String titular;
	
	public static void realizarPix(ContaBancaria origem, 
			    ContaBancaria destino, double valor) {
		origem.sacar(valor);
		destino.depositar(valor);
	}
	
	/**
	 * 
	 * @param valor
	 * @return
	 */
	public String sacar(double valor) {
		if(valor > saldo) {
			return "Deu pau, o valor não pode ser > saldo "; 
		}
		else if(valor < VALOR_MINIMO_SAQUE) {
			return "Deu pau, o valor mínimo para saque é " + VALOR_MINIMO_SAQUE;
		}
		else if(valor <= VALOR_MAXIMO_SAQUE) {
			saldo -= valor;
			return "Saque realizado com sucesso! " + valor;
		} 
		else {
			return "Deu pau, o valor máximo para saque é " + VALOR_MAXIMO_SAQUE; 
		}
	}
	
	/**
	 * Acrescenta o valor recebido ao saldo
	 * @param valor - um valor > 0
	 * @return - o resultado da operação
	 */
	public String depositar(double valor) {
		if(valor>0) {
			saldo += valor;
			return "deposito realizado com sucesso " + valor;
		}
		else {
			return "o valor a ser depositado deve ser positivo " + valor;
		}
	}
	/**
	 * retorna o valor atual do saldo
	 * @return
	 */
	public double consultar() {
		return saldo;
	}
	
	
	
}
