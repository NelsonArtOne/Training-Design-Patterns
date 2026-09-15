package achievement;

public class ForumServiceGamificationProxy implements ForumService{

    @Override
    public void addComment(String user, String topic, String comment) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addTopic(String user, String topic) {
        AchievementStorage achievementStorage = AchievementStorageFactory.getAchievementStorage();

        Points point = new Points("CREATION", 5);
        Badge badge = new Badge("I CAN TALK");

        achievementStorage.addAchievement(user, point);
        achievementStorage.addAchievement(user, badge);
        
    }

    @Override
    public void likeComment(String user, String topic, String topicUser) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void likeTopic(String user, String topic, String topicUser) {
        // TODO Auto-generated method stub
        
    }
    
    
}
