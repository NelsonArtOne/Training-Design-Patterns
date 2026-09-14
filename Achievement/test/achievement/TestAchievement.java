package achievement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateAchievementPoints () {
        Points point = new Points("First Test", 10);
        String name = point.getName();
        int quantity = point.getQ();

        assertEquals("first test", name);
        assertEquals(10, quantity);
    }

    @Test
    public void testCreateAchievementBadge() {
        Badge badge = new Badge("badge tdd works", "make test pass");
        String name = badge.getName();
        String objetive = badge.getObjective();

        assertEquals("badge tdd works", name);
        assertEquals("make test pass", objetive);
    }

    @Test
    public void testSingletonAchievementStorage() {
        AchievementStorage storageOne = AchievementStorageFactory.getAchievementStorage();
        AchievementStorage storageTwo = AchievementStorageFactory.getAchievementStorage();
        
        assertNotNull(storageOne);
        assertEquals(storageOne, storageTwo);
    }

    @Test
    public void testAddAchievementPointsForUser() {
        Points point = new Points("point test", 10);

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.addAchievement("Nelson", point);

        assertEquals(point, achievementStorage.getAchievement("Nelson", "point test"));
    }

    @Test
    public void testAddAchievementBagdeForUser() {
        Badge badge = new Badge("badge test", "test passed");

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.addAchievement("Nelson", badge);

        assertEquals(badge, achievementStorage.getAchievement("Nelson", "badge test"));
    }
    @Test
    public void testListAchievementsIsEmpty() {
        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        List<Achievement> achievements = achievementStorage.getAchievements("Nelson");
       
        assertEquals(0, achievements.size());
    }

    @Test
    public void testGetAchievements() {
        Points point = new Points("Point Test", 10);
        Badge badge = new Badge("Badge Test", "Test Passed");

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.addAchievement("Nelson", point);
        achievementStorage.addAchievement("Nelson", badge);

        List<Achievement> achievements = achievementStorage.getAchievements("Nelson");

        assertEquals(2, achievements.size());
        assertEquals(true, achievements.contains(point));
        assertEquals(true, achievements.contains(badge));
    }
    
}