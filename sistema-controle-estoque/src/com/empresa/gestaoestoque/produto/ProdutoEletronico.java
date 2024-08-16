package com.empresa.gestaoestoque.produto;

public class ProdutoEletronico extends Produto{
	private String voltagem;
	
	public ProdutoEletronico(String codigo, String nome, double preco, String voltagem) {
		super(codigo, nome, preco);
		this.voltagem = voltagem;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String getDescricao() {
		
		return " Eletrônico: " + getNome() + "(" + getVoltagem() + "V";
	}
	
}
	
	
