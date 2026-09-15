package achievement;

public interface ForumService {
    abstract void addTopic(String user, String topic);

    abstract void addComment(String user, String topic, String comment);
    
    abstract void likeTopic(String user, String topic, String topicUser);

    abstract void likeComment(String user, String topic, String topicUser);
}
