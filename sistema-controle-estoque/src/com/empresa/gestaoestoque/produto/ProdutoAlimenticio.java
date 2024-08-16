package com.empresa.gestaoestoque.produto;

public class ProdutoAlimenticio extends Produto {
	private String dataValidade;
	
	public ProdutoAlimenticio(String codigo, String nome, double preco, String dataValidade) {
		super(codigo, nome, preco);
		this.dataValidade = dataValidade;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String getDescricao() {
		
		return " Alimentício: " + getNome() + "(Validade: " + getDataValidade() + ")";
	}

	
	
	
}
