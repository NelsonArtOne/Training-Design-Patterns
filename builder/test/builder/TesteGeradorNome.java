package builder; 

import org.junit.Test;
import static org.junit.Assert.assertEquals; 

public class TesteGeradorNome { 

    @Test
    public void nomeBase() {
        GeradorNome gn = new GeradorNomeBuilder().criarPessoa().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Nelson", nome);
    }

    @Test
    public void mestre() {
        GeradorNome gn = new GeradorNomeBuilder().criarMestre().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Mestre Nelson", nome);
    }

    @Test
    public void doutor() {
        GeradorNome gn = new GeradorNomeBuilder().criarDoutor().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Doutor Nelson", nome);
    }

    @Test
    public void excelentissimoDoutor() {
        GeradorNome gn = new GeradorNomeBuilder().criarDoutor().excelentissimo().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Excelentissimo Doutor Nelson", nome);
    }

    @Test
    public void magnificoMestre() {
        GeradorNome gn = new GeradorNomeBuilder().criarMestre().magnifico().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Magnifico Mestre Nelson", nome);
    }
}