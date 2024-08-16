package com.empresa.gestaoestoque.produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoService {
	private List<Produto> produtos;
	
	public ProdutoService() {
		produtos = new ArrayList<>();
	}
	
	// Método para adicionar um produto no estoque
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto adicionado: " + produto.getDescricao());
	}
	
	// Método para consultar todos os produtos no estoque
	public void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto no estoque.");
		}else {
			for(Produto produto: produtos) {
				System.out.println(produto.getDescricao() + " - Preço: R$" + produto.getPreco());
			}
		}
	}
	
	// Método para encontrar um produto por código
	public Optional <Produto>buscarProdutoPorCodigo(String codigo){
		return produtos.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst();
		
	}
	
	// Método para remover um produto do estoque
	public void removerProduto(String codigo) {
		Optional <Produto> produtoOpt = buscarProdutoPorCodigo(codigo);
		if(produtoOpt.isPresent()) {
			produtos.remove(produtoOpt.get());
			System.out.println("Produto removido: " + produtoOpt.get().getDescricao());
			
		}else {
			System.out.println("Produto não encontrado.");
		}
	}
	
	// Método para atualizar o preço do produto.
	public void atualizarPrecoProduto(String codigo, double novoPreco) {
		Optional <Produto> produtoOpt = buscarProdutoPorCodigo(codigo);
		if (produtoOpt.isPresent()) {
			produtoOpt.get().setPreco(novoPreco);
			System.out.println("Preço atualizado para: R$ " + novoPreco);
			
		}else {
			System.out.println("Produto não encontrado.");
		}
	}
	
}
