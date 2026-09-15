package achievement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateAchievementPoints () {
        Points point = new Points("First Test", 10);
        String name = point.getName();
        int quantity = point.getQ();

        assertEquals("First Test", name);
        assertEquals(10, quantity);
    }

    @Test
    public void testCreateAchievementBadge() {
        Badge badge = new Badge("Badge TDD Works", "Make Test Pass");
        String name = badge.getName();
        String objetive = badge.getObjective();

        assertEquals("Badge TDD Works", name);
        assertEquals("Make Test Pass", objetive);
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
        Points point = new Points("Point Test", 10);

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.addAchievement("Nelson", point);

        assertEquals(point, achievementStorage.getAchievement("Nelson", "Point Test"));
    }

    @Test
    public void testAddAchievementBagdeForUser() {
        Badge badge = new Badge("Badge Test", "Test Pass");

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.addAchievement("Nelson", badge);

        assertEquals(badge, achievementStorage.getAchievement("Nelson", "Badge Test"));
    }
    @Test
    public void testListAchievementsIsEmpty() {
        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.clearUserAchievemets("Nelson");

        List<Achievement> achievements = achievementStorage.getAchievements("Nelson");
       
        assertEquals(0, achievements.size());
    }

    @Test
    public void testGetAchievements() {
        Points point = new Points("Point Test", 10);
        Badge badge = new Badge("Badge Test", "Test Passed");

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.clearUserAchievemets("Nelson");

        achievementStorage.addAchievement("Nelson", point);
        achievementStorage.addAchievement("Nelson", badge);

        List<Achievement> achievements = achievementStorage.getAchievements("Nelson");

        assertEquals(2, achievements.size());
        assertEquals(true, achievements.contains(point));
        assertEquals(true, achievements.contains(badge));
    }
    
    @Test
    public void testAddSameAchievementTwice() {
        Points point = new Points("Point Test", 10);

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();

        achievementStorage.clearUserAchievemets("Nelson");
        
        achievementStorage.addAchievement("Nelson", point);
        achievementStorage.addAchievement("Nelson", point);

        List<Achievement> achievements = achievementStorage.getAchievements("Nelson");

        assertEquals(1, achievements.size());
        assertEquals(point, achievementStorage.getAchievement("Nelson", "Point Test"));
    }
    
}