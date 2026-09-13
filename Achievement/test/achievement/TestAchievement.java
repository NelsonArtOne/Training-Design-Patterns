package achievement;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateAchievementPoints () {
        Points p = new Points("Certificado Java", 10);
        String name = p.getName();
        int q = p.getQ();

        assertEquals("Points Certificado Java", name);
        assertEquals(10, q);
    }
    @Test
    public void testCreateAchievementBadge() {
        Badge b = new Badge("Gol", "Fazer 3 gols");
        String name = b.getName();
        String objetive = b.getObjective();

        assertEquals("Badge Gol", name);
        assertEquals("Fazer 3 gols", objetive);
    }
    @Test
    public void testAddAchivementPoints() {
        Points p = new Points("Teste Points", 10);
        
        AchievementStore a = new AchievementStore();
        
        a.addAchievement(p);

        assertEquals(true, a.getIfAchievementWasAdd(p));
    }
    
    @Test
    public void testAddAchivementBadge() {
        Badge b = new Badge("Teste Badge", "Add Badge");
        
        AchievementStore a = new AchievementStore();
        
        a.addAchievement(b);

        assertEquals(true, a.getIfAchievementWasAdd(b));
    }
}