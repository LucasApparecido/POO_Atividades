/*
8. Desenvolva, uma classe que modele um objeto conta
poupança em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. A classe deverá ter as seguintes características: nome do cliente, número da conta,
agencia, saldo, sacar dinheiro e depositar dinheiro. 
*/

public class AnexoB08 {
    public static void main(String[] args) {
        ContaPoupanca pessoa1 = new ContaPoupanca("Luke", 7, 3, 24.5f);

        pessoa1.depositar(73.0f);
        pessoa1.sacar(37.0f);

        System.out.println("Nome do cliente: " + pessoa1.getNomeCliente());
        System.out.println("Número da conta: " + pessoa1.getNumeroConta());
        System.out.println("Agência: " + pessoa1.getAgencia());
        System.out.println("Saldo: R$" + pessoa1.getSaldo());
    }
}

class ContaPoupanca {

    private String nomeCliente;
    private int numeroConta;
    private int agencia;
    private float saldo;

    public ContaPoupanca(String nomeCliente, int numeroConta, int agencia, float saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o depósito. Valor inválido.");
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}