package com.sistema.livraria;

import java.util.Date;

public class Venda {
	private Livro livro;
	private Date dataVenda;
	private int quantidade;

	public Venda(Livro livro, Date dataVenda, int quantidade) {
		this.livro = livro;
		this.dataVenda = dataVenda;
		this.quantidade = quantidade;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return livro.getTitulo() + " - Quantidade: " + quantidade;
	}

}
