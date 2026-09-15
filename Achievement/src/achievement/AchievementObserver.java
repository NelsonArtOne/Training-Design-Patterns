package achievement;

public interface AchievementObserver {

    abstract void achievementUpdate(String user, Achievement a);
    
}
