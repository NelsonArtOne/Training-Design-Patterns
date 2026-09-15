package achievement;

import java.util.List;

public interface AchievementStorage {
    
    abstract void addAchievement(String user, Achievement a);

    abstract Achievement getAchievement(String user, String achievementName);

    abstract List<Achievement> getAchievements(String user);

    abstract void setAchievementStorage(AchievementStorage a);
    abstract void clearUserAchievemets(String user);

}