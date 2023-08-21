package org.example;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Funcionario> listaFuncionarios;
    private Funcionario presidente;

    public Empresa() {
        this.listaClientes = new ArrayList<Cliente>();
        this.listaFuncionarios = new ArrayList<Funcionario>();
        this.presidente = null;
    }

    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return listaFuncionarios;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void definirPresidente(Funcionario p) {
        this.presidente = p;
    }

    public void removePresidente(){
        this.presidente = null;
    }

    public void addCliente(Cliente c){
        this.listaClientes.add(c);
    }
    public void addFuncionario(Funcionario f){
        this.listaFuncionarios.add(f);
    }

    public void removeCliente (Cliente c){
        this.listaClientes.remove(c);
    }

    public void removeFuncionario (Funcionario f){
        this.listaFuncionarios.remove(f);
    }

}
