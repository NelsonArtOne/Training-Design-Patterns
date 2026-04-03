package nullObject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestItem {

    @Test 
    public void testSemDesconto() {
        Item i = new Item("Tenis", 150.00);
        assertEquals(300.0, i.precoQuantidade(2), 0.001);
        assertEquals("Tenis R$150.0", i.toString());
    }

    @Test
    public void testDescontoPercentual() { 
        Item i = new Item("Tenis", 150.00, new DescontoPercentual(10));
        assertEquals(270.0, i.precoQuantidade(2), 0.001);
        assertEquals("Tenis R$135.0", i.toString());
    }
    
    @Test 
    public void testDescontoAbsoluto() { 
        Item i = new Item("Tenis", 150.0, new DescontoAbsoluto(10));
        assertEquals(280.0, i.precoQuantidade(2), 0.001);
        assertEquals("Tenis R$140.0", i.toString());
    }
}