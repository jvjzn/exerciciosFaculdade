package org.example;

public class Conta {
    private float saldo;
    private String idConta;
    static int contador = 0;

    Conta(float saldo, String idConta){
        this.saldo = saldo;
        this.idConta = idConta;
    }
    Conta(){
        this.saldo = 0;
        this.idConta = "0000000 0";
    }



    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public float depositar(float valor) {
        this.saldo += valor;
        contador++;
        return getSaldo();
    }

    public float sacar(float valor) {
        this.saldo -= valor;
        contador++;
        return getSaldo();
    }
}
