package com.empresa.gestaoestoque.util;

import com.empresa.gestaoestoque.produto.Produto;
import com.empresa.gestaoestoque.produto.ProdutoAlimenticio;
import com.empresa.gestaoestoque.produto.ProdutoEletronico;
import com.empresa.gestaoestoque.produto.ProdutoService;

public class MenuUtil {
	public static void exibirMenu(ProdutoService produtoService) {
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("\n === Menu Gestão de Estoque ===");
			System.out.println(" 1. Adicionar Produto");
			System.out.println(" 2. Listar Produtos");
			System.out.println(" 3. Atualizar Preço do Produto");
			System.out.println(" 4. Remover Produtos");
			System.out.println(" 5. Sair");
			
			int opcao = InputUtil.LerInt("\n Escolha uma opção:");
			
			switch (opcao) {
            case 1:
                adicionarProduto(produtoService);
                break;
            case 2:
                produtoService.listarProdutos();
                break;
            case 3:
                atualizarPreco(produtoService);
                break;
            case 4:
                removerProduto(produtoService);
                break;
            case 5:
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
         }
     }
   }
	// Método para adicionar um produto, interagindo com o usuário
    private static void adicionarProduto(ProdutoService produtoService) {
        String tipoProduto = InputUtil.LerString("Tipo de produto (1-Eletrônico, 2-Alimentício): ");
        String codigo = InputUtil.LerString("Código: ");
        String nome = InputUtil.LerString("Nome: ");
        double preco = InputUtil.LerDouble("Preço: ");

        Produto produto = null;

        if (tipoProduto.equals("1")) {
            String voltagem = InputUtil.LerString("Voltagem: ");
            produto = new ProdutoEletronico(codigo, nome, preco, voltagem);
        } else if (tipoProduto.equals("2")) {
            String dataValidade = InputUtil.LerString("Data de Validade: ");
            produto = new ProdutoAlimenticio(codigo, nome, preco, dataValidade);
        } else {
            System.out.println("Tipo de produto inválido.");
            return;
        }

        produtoService.adicionarProduto(produto);
    }

    // Método para atualizar o preço de um produto existente
    private static void atualizarPreco(ProdutoService produtoService) {
        String codigo = InputUtil.LerString("Código do produto a ser atualizado: ");
        double novoPreco = InputUtil.LerDouble("Novo preço: ");
        produtoService.atualizarPrecoProduto(codigo, novoPreco);
    }

    // Método para remover um produto existente
    private static void removerProduto(ProdutoService produtoService) {
        String codigo = InputUtil.LerString("Código do produto a ser removido: ");
        produtoService.removerProduto(codigo);
    }
 }
