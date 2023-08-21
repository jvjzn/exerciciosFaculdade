package org.example;

public class Pessoa {

    private String nome, cpf;
    private int idade;
    private char sexo;

    Pessoa (){
        this.nome = "Maria";
        this.idade = 15;
        this.cpf = "000.123.000-11";
        this.sexo = 'F';
    }

    Pessoa (String nome, String cpf, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean atingiuMaioridade() {
        if (getIdade() >= 18){
            return true;
        } else {
            return false;
        }
    }
}
