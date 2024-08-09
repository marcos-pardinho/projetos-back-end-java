package br.com.banco.digital;

public abstract class Conta {
	protected String numeroConta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(String numeroConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public abstract void sacar(double valor);

	// Método para depósito, comum a todas as contas
		public void depositar (double valor) {
			if (valor > 0 ) {
				saldo += valor;
			}
		}
		
		// Método para obter o saldo
		public double getSaldo() {
			return saldo;
		}
		
		// Método para obter o número da conta
		public String getNumeroConta() {
			return numeroConta;
		}

}
