package br.com.banco.digital;

public class ContaCorrente extends Conta {
	private static final double TAXA_OPERACAO = 0.05;
	
	// Construtor da classe contaCorrente
	public ContaCorrente(String numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
	}
	
	//Implementação do método de saque para conta corrente
	
	@Override
	public void sacar(double valor) {
		if(valor + TAXA_OPERACAO <= saldo) {
			saldo -= (valor + TAXA_OPERACAO);
		}
	}
}
