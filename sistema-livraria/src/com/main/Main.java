package com.main;

import com.sistema.livraria.Autor;
import com.sistema.livraria.Livro;
import com.sistema.livraria.Venda;
import com.service.LivrariaService;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// Criação do serviço da Livraria
		
		LivrariaService livrariaService = new LivrariaService();
		
		// Criação de autores
		Autor autor1 = new Autor("J.K. Rowling", "Britânica");
		Autor autor2 = new Autor("George R.R. Martin", "Americano");
		
		
		// Criação de livros
		Livro livro1 = new Livro("Harry Potter e a pedra Filosofal", autor1, 29.90);
		Livro livro2 = new Livro("Games of Thones", autor2, 49.90);
		
		// Adicionar livros ao sistema
		livrariaService.adicionarLivro(livro1);
		livrariaService.adicionarLivro(livro2);
		
		// Registrar vendas
		Venda venda1 = new Venda(livro1, new Date(), 2);
		Venda venda2 = new Venda(livro2, new Date(), 1);
		
		livrariaService.registraVenda(venda1);
		livrariaService.registraVenda(venda2);
		
		// Listar livros e vendas
		System.out.println("Livros disponíveis:");
		for(Livro livro : livrariaService.listarLivros()) {
			System.out.println(livro.getTitulo() + " por " + livro.getAutor().getNome());
		}
		
		System.out.println("\nVendas registradas:");
		for (Venda venda : livrariaService.listarVendas()) {
			System.out.println(venda);
		}
		
	}
}
