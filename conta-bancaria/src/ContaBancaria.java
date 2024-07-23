// Classe principal que representa uma conta Bancária
public class ContaBancaria {

        private double saldo;
        private String numeroConta;

        public ContaBancaria(String numeroConta, double saldoInicial){
            this.numeroConta = numeroConta;
            this.saldo = saldoInicial;
        }

        // Método para depositar um valor na conta
        public void depositar(double valor){
            if (valor > 0){
                saldo += valor;
                System.out.println("Depósito de " + valor + " realizado com sucesso.");
            }else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        // Método para sacar um valor na conta
        public void sacar(double valor){
            if (valor > 0 && valor <= saldo){
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado com sucesso ");
            }else {
                System.out.println("Saldo insuficiente ou valor inválido");
            }
        }
        
        // Método para verificar o saldo na conta
        public double verificarSaldo (){
            return saldo;
        }

        // Método principal para testar a classe bancária
        public static void main(String[] args) {
            ContaBancaria minhaConta = new ContaBancaria("12345", 1000.00);

            // Exibir o saldo inicial
            System.out.println("Saldoinicial: " + minhaConta.verificarSaldo());

            // Realizar um depósito e exibe o saldo atualizado
            minhaConta.depositar(500.00);
            System.out.println("Saldo após o depósito: " + minhaConta.verificarSaldo());

            // Realizar um saque e exibir o saldo atualizado
            minhaConta.sacar(200.00);
            System.out.println("Saldo após o saque: " + minhaConta.verificarSaldo());

            // Tentar realizar um saque com o valor maior que o saldo disponível
            minhaConta.sacar(2000.00);
            System.out.println("Saldo final: " + minhaConta.verificarSaldo());


        }

        
}