package org.example;

public class Main {
    public static void main(String[] args) {

        Empresa novaEmpresa = new Empresa();

        Funcionario presida = new Funcionario("Barnabé Soares","Rua da Barata, 512", "(31)98765-1234", "30312-334","Horizonte Antigo", "MZ", "123.456.789-00","Presidente",14899.20);

        novaEmpresa.definirPresidente(presida);

        System.out.println(novaEmpresa.getPresidente().getNome());

        Funcionario fun1 = new Funcionario("GeGe","Rua da Formiga, 312", "(31)91234-0000", "11111-334","Horizonte Antigo", "MZ", "123.456.789-01","Faxineiro",1899.30);

        novaEmpresa.addFuncionario(fun1);

        Cliente cliFis = new Cliente("Santos Jr","Rua do Bosque, 1000", "(31)91234-0001", "11111-335","Horizonte Antigo", "MZ", 2399.40,"123.456.789-02",null);

        novaEmpresa.addCliente(cliFis);

        Cliente cliJuri = new Cliente("Silhueta Silva","Rua do Ouro, 4002", "(31)91234-0002", "11111-336","Horizonte Antigo", "MZ", 10000.00,null,"23.456.789/0001-20");

        novaEmpresa.addCliente(cliJuri);


    }
}