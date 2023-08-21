package org.example;

public class Cliente extends PessoaFisica {
    private double limiteCredito;
    private String cnpj;

    public Cliente(String nome, String endereco, String telefone, String cep, String cidade, String uf, double limiteCredito, String cpf, String cnpj) {
        super(nome, endereco, telefone, cep, cidade, uf, cpf);
        this.limiteCredito = limiteCredito;
        this.cnpj = cnpj;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
