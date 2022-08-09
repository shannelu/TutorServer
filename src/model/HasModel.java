package ca.ubc.cs304.model;

public class HasModel {
    private final String TopicName;
    private final String CourseName;
    private final int TutorId;
    private final int AssignNumber;

    public HasModel(String TopicName, String CourseName, int TutorId, int AssignNumber) {
        this.TopicName = TopicName;
        this.CourseName =CourseName;
        this.TutorId = TutorId;
        this.AssignNumber = AssignNumber;
    }

    public int getAssignNumber() {
        return AssignNumber;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getTutorId() {
        return TutorId;
    }

    public String getTopicName() {
        return TopicName;
    }
}
