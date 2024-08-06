package com.sistema.livraria;

public class Livro {
	private String titulo;
	private Autor autor;
	private double preco;
	
	public Livro(String titulo, Autor autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
