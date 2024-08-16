package gerenciaBanco;

import java.util.Locale;
import java.util.Scanner;

class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaBancaria conta = new ContaBancaria();
        int opcao = 0;

        System.out.print("Informe seu nome:");
        conta.setNome(scanner.nextLine());

        System.out.print("Informe seu sobrenome:");
        conta.setSobrenome(scanner.nextLine());

        System.out.print("Informe seu CPF:");
        conta.setCpf(scanner.nextLine());

        conta.mostrarInformacoes(); // Exibindo informações do cliente

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.realizarDeposito(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.realizarSaque(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando aplicação. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
