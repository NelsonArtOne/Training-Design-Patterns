package observer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestQuebradorPalavras {

    @Test
    public void quebradorPalavras() {
        String frase = "O Rato roeu a roupa do rei";
        QuebradorPalavras q = new QuebradorPalavras();
        String[] palavras = q.quebrar(frase); 

        assertEquals(7, palavras.length);
    }

    @Test
    public void contadorSimples() {
        String frase = "O Rato roeu a roupa do rei";
        QuebradorPalavras q = new QuebradorPalavras();
        
        q.adicionaContador("SIMPLES", new ContadorSimples());
        q.quebrar(frase); 

        assertEquals(7, q.getContagem("SIMPLES"));
    }

    @Test
    public void contadorMaiuscula() {
        String frase = "O Rato roeu a roupa do rei";
        QuebradorPalavras q = new QuebradorPalavras();
        
        q.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
        q.quebrar(frase); 

        assertEquals(2, q.getContagem("MAIUSCULA"));
    }

    @Test
    public void contadorLetrasPares() {
        String frase = "O Rato roeu a roupa do rei";
        QuebradorPalavras q = new QuebradorPalavras();
        
        q.adicionaContador("PARES", new ContadorPares());
        q.quebrar(frase); 

        assertEquals(3, q.getContagem("PARES"));
    }

    @Test
    public void contadorIntegrado() {
        String frase = "O Rato roeu a roupa do rei";
        QuebradorPalavras q = new QuebradorPalavras();
        
        q.adicionaContador("SIMPLES", new ContadorSimples());
        q.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
        q.adicionaContador("PARES", new ContadorPares());
        q.quebrar(frase); 

        assertEquals(7, q.getContagem("SIMPLES"));
        assertEquals(2, q.getContagem("MAIUSCULA"));
        assertEquals(3, q.getContagem("PARES"));
    }
    
}
