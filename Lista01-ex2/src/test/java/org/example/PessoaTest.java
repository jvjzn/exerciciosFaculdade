package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa novaPessoa = new Pessoa("João","123.456.789-00",20,'M');

    @Test
    public void conferirMaioridade(){
        novaPessoa.atingiuMaioridade();
        assertEquals(true,novaPessoa.atingiuMaioridade());
    }
}
