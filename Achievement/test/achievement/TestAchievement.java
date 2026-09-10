package achievement;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateNewAchievementPoints () {
        Points p = new Points("Certificado Java", 10);
        String name = p.getName();
        int q = p.getQ();
        
        assertEquals("Certificado Java", name);
        assertEquals(10, q);
    }
    @Test
    public void testCreateNewAchievementBadge() {
        Badge b = new Badge("Gol", "Fazer 3 gols");
        String name = b.getName();
        String objetive = b.getObjective();

        assertEquals("Gol", name);
        assertEquals("Fazer 3 gols", objetive);
    }
}