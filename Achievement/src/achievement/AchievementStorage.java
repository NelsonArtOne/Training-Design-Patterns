package achievement;

import java.util.ArrayList;
import java.util.List;

public interface AchievementStorage {
    
    List<Achievement> achievements = new ArrayList<>();

    abstract void addAchievement(String user, Achievement a);

    abstract Achievement getAchievement(String user, String achievementName);

    abstract List<Achievement> getAchievements(String user);

    abstract void setAchievementStorage(AchievementStorage a);

}
