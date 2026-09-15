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
        int quantity = point.getPointsQuantity();

        assertEquals("First Test", name);
        assertEquals(10, quantity);
    }

    @Test
    public void testCreateAchievementBadge() {
        Badge badge = new Badge("Badge TDD Works");
        String name = badge.getName();

        assertEquals("Badge TDD Works", name);
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
        Badge badge = new Badge("Badge Test");

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
        Badge badge = new Badge("Badge Test");

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

    @Test
    public void testSumAchivementsPoints() {
        Points pointOne = new Points("Point Test 1.0", 10);
        Points pointTwo = new Points("Point Test 2.0", 5);
        Points pointTree = new Points("Point Test 3.0", 20);


        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();

        achievementStorage.clearUserAchievemets("Nelson");

        achievementStorage.addAchievement("Nelson", pointOne);
        achievementStorage.addAchievement("Nelson", pointTwo);
        achievementStorage.addAchievement("Nelson", pointTree);

        Achievement a = achievementStorage.getAchievement("Nelson", "Point Test 3.0");

        assertEquals(35, a.getTotalPoints());
    }
    
    @Test
    public void testAddTopic() {
        ForumService f = new ForumServiceGamificationProxy();

        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();
        
        achievementStorage.clearUserAchievemets("Nelson");

        f.addTopic("Nelson", "Hello World");

        Achievement point = achievementStorage.getAchievement("Nelson", "CREATION"); 
        Achievement badge = achievementStorage.getAchievement("Nelson", "I CAN TALK");
        
        assertEquals("CREATION", point.getName());
        assertEquals("I CAN TALK", badge.getName());
    }

    @Test void testAddComment() { 

    }
}