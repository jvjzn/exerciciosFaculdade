package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {

    Conta novaConta = new Conta(7630F, "1234567 8");

    @Test
    public void testarDeposito(){
        novaConta.depositar(3000.42F);
        assertEquals(10630.42F,novaConta.getSaldo());
    }

    @Test
    public void testarSaque(){
        novaConta.sacar(2002.02F);
        assertEquals(5627.98F,novaConta.getSaldo());
    }

}
