package com.service;

import com.sistema.livraria.Livro;
import com.sistema.livraria.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivrariaService {
	
	private List <Livro>livros;
	private List <Venda>vendas;
	
	public LivrariaService() {
		this.livros = new ArrayList<>();
		this.vendas = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void registraVenda(Venda venda) {
		vendas.add(venda);
	}
	
	public List<Livro> listarLivros(){
		return Collections.unmodifiableList(livros);
	}
	
	public List<Venda> listarVendas(){
		return Collections.unmodifiableList(vendas);
	}
}
