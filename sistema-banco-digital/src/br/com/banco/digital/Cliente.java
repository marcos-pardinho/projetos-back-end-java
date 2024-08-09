package br.com.banco.digital;


// Classe que representa um cliente do banco
public class Cliente {
	private String nome;
	private String cpf;
	
	// Construtor da classe cliente
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Métodos getters para obter nome e cpf
	public String getNome() {
		return nome;
	}
	
	public String getcpf() {
		return cpf;
	}
}
