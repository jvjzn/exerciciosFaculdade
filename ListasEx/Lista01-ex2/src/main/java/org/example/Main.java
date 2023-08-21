package org.example;

public class Main {
    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa("Pedro","123.890.321-18",18,'M');

        System.out.println("O nome cadastrado: " + novaPessoa.getNome());
        System.out.println("O CPF cadastrado: " + novaPessoa.getCpf());
        System.out.println("O sexo cadastrado: " + novaPessoa.getSexo());

        boolean maioridade = novaPessoa.atingiuMaioridade();

        if(maioridade == true){
            System.out.println(" - A pessoa cadastrada é maior de idade.");
        } else {
            System.out.println(" - A pessoa cadastrada não é maior de idade.");
        }
        

    }
}