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

    @Test
    public void excelentissimoMagnificoDoutor() {
        GeradorNome gn = new GeradorNomeBuilder().criarDoutor().excelentissimo().magnifico().gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Excelentissimo Magnifico Doutor Nelson", nome);
    }
    @Test
    public void pessoaDeMogiDasCruzes() {
        GeradorNome gn = new GeradorNomeBuilder().criarPessoa().de("Mogi das Cruzes").gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Nelson de Mogi das Cruzes", nome);
    }

    @Test
    public void magnificoDoutorDeMogiDasCruzesDeSãoPaulo() {
        GeradorNome gn = new GeradorNomeBuilder().criarDoutor().magnifico().de("Mogi das Cruzes").de("São Paulo").gerar();
        String nome = gn.gerarNome("Nelson");

        assertEquals("Magnifico Doutor Nelson de Mogi das Cruzes de São Paulo", nome);
    }



}