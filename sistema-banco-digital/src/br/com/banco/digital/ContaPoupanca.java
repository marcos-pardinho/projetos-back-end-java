package br.com.banco.digital;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
	}
	
	// Implementação do método de saque para conta poupança
	
	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			valor -= valor;
		}
	}
}
