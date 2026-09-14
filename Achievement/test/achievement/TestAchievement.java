package achievement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateAchievementPoints () {
        Points p = new Points("First Test", 10);
        String name = p.getName();
        int q = p.getQ();

        assertEquals("First Test", name);
        assertEquals(10, q);
    }

    @Test
    public void testCreateAchievementBadge() {
        Badge b = new Badge("Badge TDD Works", "Make Test Passed");
        String name = b.getName();
        String objetive = b.getObjective();

        assertEquals("Badge TDD Works", name);
        assertEquals("Make Test Passed", objetive);
    }

    @Test
    public void testSingletonAchievementStorage() {
        AchievementStorage storageOne = AchievementStorageFactory.getAchievementStorage();
        AchievementStorage storageTwo = AchievementStorageFactory.getAchievementStorage();
        
        assertNotNull(storageOne);
        assertEquals(storageOne, storageTwo);
    }

    @Test
    public void testAddAchivementPointsForUser() {
        Points p = new Points("Points Test", 10);

        AchievementStorage a = AchievementStorageFactory.getAchievementStorage();
        
        a.addAchievement("Nelson", p);

        assertEquals(p, a.getAchievement("Nelson", "Points Test"));
    }

    @Test
    public void testAddAchivementBagdeForUser() {
        Badge b = new Badge("Badge Test", "Test Passed");
        
        AchievementStorage a = AchievementStorageFactory.getAchievementStorage();
        
        a.addAchievement("Nelson", b);

        assertEquals(b, a.getAchievement("Nelson", "Badge Test"));
    }
    
}