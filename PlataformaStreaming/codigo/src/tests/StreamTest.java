import app.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreamTest {

    @Test
    public void testarStreamComDadosCompletosSerie() {
        Stream stream = new Serie(1, "Netflix", 2, 0, "2022-01-01", 0);
        Assertions.assertEquals(1, stream.getId());
        Assertions.assertEquals("Netflix", stream.getNome());
        Assertions.assertEquals(Stream.generos[2], stream.getGenero());
        Assertions.assertEquals(Stream.idiomas[0], stream.getIdioma());
        Assertions.assertEquals("2022-01-01", stream.getDataLancamento());
    }
    
    @Test
    public void testarStreamComDadosCompletosFilme() {
        Stream stream = new Filme(1, "Netflix", 2, 0, "2022-01-01", 0);
        Assertions.assertEquals(1, stream.getId());
        Assertions.assertEquals("Netflix", stream.getNome());
        Assertions.assertEquals(Stream.generos[2], stream.getGenero());
        Assertions.assertEquals(Stream.idiomas[0], stream.getIdioma());
        Assertions.assertEquals("2022-01-01", stream.getDataLancamento());
    }

    @Test
    public void testarStreamComDadosAleatoriosSerie() {
        Stream stream = new Serie(1, "Netflix", "2022-01-01");
        Assertions.assertEquals(1, stream.getId());
        Assertions.assertEquals("Netflix", stream.getNome());
        Assertions.assertNotNull(stream.getGenero());
        Assertions.assertNotNull(stream.getIdioma());
        Assertions.assertEquals("2022-01-01", stream.getDataLancamento());
    }
    
    @Test
    public void testarStreamComDadosAleatoriosFilme() {
        Stream stream = new Filme(1, "Netflix", "2022-01-01", 0);
        Assertions.assertEquals(1, stream.getId());
        Assertions.assertEquals("Netflix", stream.getNome());
        Assertions.assertNotNull(stream.getGenero());
        Assertions.assertNotNull(stream.getIdioma());
        Assertions.assertEquals("2022-01-01", stream.getDataLancamento());
    }

}
