package br.com.banco.main;

import br.com.banco.digital.Cliente;
import br.com.banco.digital.Conta;
import br.com.banco.digital.ContaCorrente;
import br.com.banco.digital.ContaPoupanca;
import br.com.banco.servico.GerenciadorContas;

import java.util.Locale;
import java.util.Scanner;

public class BancoDigital {
	public static void main(String[] args) {
		// Scanner para entrada de dados do usuário
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		GerenciadorContas gerenciador = new GerenciadorContas();

		// Criação de alguns clientes e contas
		Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
		Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

		Conta conta1 = new ContaCorrente("001", cliente1);
		Conta conta2 = new ContaPoupanca("002", cliente2);

		gerenciador.adicionarConta(conta1);
		gerenciador.adicionarConta(conta2);

		// Menu de opções para o usuário
		int opcao;

		do {
			System.out.println("-------Banco Digital-------");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Ver Saldo");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Número da conta: ");
				String numeroContaDeposito = scanner.next();
				Conta contaDeposito = gerenciador.buscarConta(numeroContaDeposito);
				if (contaDeposito != null) {
					System.out.print("Valor a depositar: ");
					double valorDeposito = scanner.nextDouble();
					contaDeposito.depositar(valorDeposito);
					System.out.println("Depósito realizado com sucesso!");
				} else {
					System.out.println("Conta não encontrada.");
				}
				break;
			case 2:
				System.out.print("Número da conta: ");
				String numeroContaSaque = scanner.next();
				Conta contaSaque = gerenciador.buscarConta(numeroContaSaque);
				if (contaSaque != null) {
					System.out.print("Valor a sacar: ");
					double valorSaque = scanner.nextDouble();
					contaSaque.sacar(valorSaque);
					System.out.println("Saque realizado com sucesso!");
				} else {
					System.out.println("Conta não encontrada.");
				}
				break;
			case 3:
				System.out.print("Número da conta: ");
				String numeroContaSaldo = scanner.next();
				Conta contaSaldo = gerenciador.buscarConta(numeroContaSaldo);
				if (contaSaldo != null) {
					System.out.println("Saldo: " + contaSaldo.getSaldo());
				} else {
					System.out.println("Conta não encontrada.");
				}
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);

		scanner.close();
	}
}
