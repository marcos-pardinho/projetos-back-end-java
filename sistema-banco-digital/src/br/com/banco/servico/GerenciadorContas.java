package br.com.banco.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.banco.digital.Conta;

public class GerenciadorContas {
	
	private List<Conta>contas;
	
	public GerenciadorContas() {
		contas = new ArrayList<>();
	}
	
	// Método para adicionar uma nova conta
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	// Método para buscar uma conta pelo número
	public Conta buscarConta(String numeroConta) {
		for(Conta conta : contas) {
			if (conta.getNumeroConta().equals(numeroConta)) {
				return conta;
			}
		}
		
		return null;
	}
}
