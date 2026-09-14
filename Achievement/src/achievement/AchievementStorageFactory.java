package achievement;

public class AchievementStorageFactory{
    static public AchievementStorage getAchievementStorage() {
        return MemoryAchievementStorage.getInstance();
    }
    
}
