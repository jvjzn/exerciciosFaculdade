package org.example;

public class Funcionario extends PessoaFisica{
    private String cargo;
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf, String cargo, double salario) {
        super(nome, endereco, telefone, cep, cidade, uf, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
