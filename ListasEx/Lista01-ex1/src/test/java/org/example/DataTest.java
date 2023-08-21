package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DataTest {

    @Test
    public void setDiaInvalido(){
        ExcecaoDataInvalida e = assertThrows(ExcecaoDataInvalida.class, () -> {Data dataComErro1 = new Data(32,4,2023);});
        assertEquals("Dia inválido: 32",e.getMessage());
    }

    @Test
    public void setMesInvalido(){
        ExcecaoDataInvalida e = assertThrows(ExcecaoDataInvalida.class, () -> {Data dataComErro2 = new Data(15,13,2023);});
        assertEquals("Mês inválido: 13",e.getMessage());
    }

    @Test
    public void setAnoInvalido(){
        ExcecaoDataInvalida e = assertThrows(ExcecaoDataInvalida.class, () -> {Data dataComErro3 = new Data(15,4,-4);});
        assertEquals("Ano inválido: -4",e.getMessage());
    }

    Data novaData;

    {
        try {
            novaData = new Data(12,12,2002);
        } catch (ExcecaoDataInvalida e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void verificarAdicionaDias(){
        novaData.adicionaDias(3);
        assertEquals(15, novaData.getDia());
    }

    @Test
    public void avancarProximoDia(){
        novaData.proximoDia();
        assertEquals(13, novaData.getDia());
    }

    @Test
    public void contarDiasNoMes(){
        novaData.diasNoMes();
        assertEquals(31, novaData.diasNoMes());
    }

    @Test
    public void verificarAnoBisexto(){
        novaData.eAnoBisexto();
        assertEquals(false,novaData.eAnoBisexto());
    }

    @Test
    public void verificarDiaDaSemana(){
        novaData.diaDaSemana();
        assertEquals("quinta-feira",novaData.diaDaSemana());
    }

    @Test
    public void escreverDataPorExtenso(){
        novaData.porExtenso();
        assertEquals("doze de dezembro de dois mil e dois",novaData.porExtenso());
    }
}
