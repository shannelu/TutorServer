package ca.ubc.cs304.model;

public class TopicsModel {
    private final String TopicName;
    private final String CourseName;
    private final int Difficult;

    public TopicsModel(String TopicName, String CourseName, int Difficult){
        this.TopicName = TopicName;
        this.CourseName = CourseName;
        this.Difficult = Difficult;
    }

    public String getTopicName() {
        return TopicName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getDifficult() {
        return Difficult;
    }
}
