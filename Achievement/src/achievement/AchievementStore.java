package achievement;

import java.util.ArrayList;
import java.util.List;

public class AchievementStore {
    List<Achievement> achievements = new ArrayList<>();

    public void addAchievement(Achievement a) {
        this.achievements.add(a);
    }
    public boolean getIfAchievementWasAdd(Achievement a) {
        return this.achievements.contains(a);
    }
    



}
