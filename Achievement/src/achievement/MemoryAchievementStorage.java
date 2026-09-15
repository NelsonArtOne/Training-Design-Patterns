package achievement;

import java.util.ArrayList;
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
        if(user == null || a == null) {
            return;
        }

        List<Achievement> achievements = storage.get(user);

        if(achievements == null) {
            achievements = new ArrayList<>();
            achievements.add(a);
            storage.put(user, achievements);
        }   

        if(achievements.contains(a)) {
            return;
        }
        achievements.add(a);
    } 

    @Override
    public Achievement getAchievement(String user, String achievementName) {
        if(storage.containsKey(user)) {
            List<Achievement> list = storage.get(user);

            for(Achievement item : list) {
                if(item.getName() == achievementName) {
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public List<Achievement> getAchievements(String user) {
        if(storage.containsKey(user)) {
            List<Achievement> list = storage.get(user);
            return list;
        }
        return null;

    }

    @Override
    public void setAchievementStorage(AchievementStorage a) {
        getInstance(); 
    }

    public void clearUserAchievemets(String user) {
        List<Achievement> achievements = storage.get(user);
        achievements.clear();
    }
}
    