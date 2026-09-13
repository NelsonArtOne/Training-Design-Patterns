package achievement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryAchievementStorage implements AchievementStorage {

    private static MemoryAchievementStorage singleton;

    Map<String, List<Achievement>> storage = new HashMap<>();


    private MemoryAchievementStorage() {

    }

    public static MemoryAchievementStorage getInstance() {
        if(singleton == null) {
            singleton = new MemoryAchievementStorage();
        }
        
        return singleton;
    }

    @Override
    public void addAchievement(String user, Achievement a) {
    }

    @Override
    public Achievement getAchievement(String user, String achievementName) {

        return null;
    }

    @Override
    public Achievement getAchievements(String user) {

        return null;
    }

    @Override
    public void setAchievementStorage(AchievementStorage a) {
        getInstance(); 
    }

    

}
    
