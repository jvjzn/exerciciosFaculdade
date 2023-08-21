package org.example;

public class Main {
    public static void main(String[] args) {

        Conta novaConta = new Conta(0F,"1233219 0");

        System.out.println("Número da conta: " + novaConta.getIdConta());
        System.out.printf("Saldo da conta: R$%.2f\n", novaConta.getSaldo());

        float resultadoDeposito = novaConta.depositar(3500F);
        System.out.printf("Após o depósito, o saldo da conta ficou: R$%.2f\n", resultadoDeposito);

        float resultadoSaque = novaConta.depositar(27.9F);
        System.out.printf("Após o saque, o saldo da conta ficou: R$%.2f\n", resultadoSaque);

        int mov = novaConta.getContador();
        System.out.println("Total de movimentações na conta: " + mov);
    }
}