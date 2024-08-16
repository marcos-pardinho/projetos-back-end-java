package br.com.empresa.gestaoestoque;

import com.empresa.gestaoestoque.util.MenuUtil;
import com.empresa.gestaoestoque.produto.ProdutoService;

public class Main {
	public static void main(String[] args) {
		ProdutoService produtoService = new ProdutoService();
		
		MenuUtil.exibirMenu(produtoService);
	}
}
