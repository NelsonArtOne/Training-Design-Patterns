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
    public void testAddAchivementPointsForUser() {
        Points p = new Points("Test Points", 10);

        AchievementStorage a = AchievementStorageFactory.getAchievementStorage();
        
        a.addAchievement("Nelson", p);

        assertEquals(p, a.getAchievement("Nelson", "Test Points"));
    }
    
}