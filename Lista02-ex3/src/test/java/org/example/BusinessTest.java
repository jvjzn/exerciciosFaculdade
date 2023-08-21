package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessTest {

        Empresa novaEmpresa = new Empresa();

    @Test
    public void VerifDefDePresidente() {
        Funcionario presida = new Funcionario("Barnabé Soares", "Rua da Barata, 512", "(31)98765-1234", "30312-334", "Horizonte Antigo", "MZ", "123.456.789-00", "Presidente", 14899.20);
        novaEmpresa.definirPresidente(presida);
        assertEquals("Barnabé Soares", novaEmpresa.getPresidente().getNome());
    }

    @Test
    public void CheckAddClientes(){
        Cliente cliFis = new Cliente("Santos Jr","Rua do Bosque, 1000", "(31)91234-0001", "11111-335","Horizonte Antigo", "MZ", 2399.40,"123.456.789-02",null);
        novaEmpresa.addCliente(cliFis);
        Cliente cliJuri = new Cliente("Silhueta Silva","Rua do Ouro, 4002", "(31)91234-0002", "11111-336","Horizonte Antigo", "MZ", 10000.00,null,"23.456.789/0001-20");
        novaEmpresa.addCliente(cliJuri);
        assertEquals(true,novaEmpresa.getClientes().contains(cliFis));
        assertEquals(true,novaEmpresa.getClientes().contains(cliJuri));
    }
}
