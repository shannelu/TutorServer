package ca.ubc.cs304.model;

public class CanTeachModel {
    private final String SubjectName;
    private final int TutorId;

    public CanTeachModel(String SubjectName, int TutorId) {
        this.SubjectName = SubjectName;
        this.TutorId = TutorId;
    }

    public int getTutorId() {
        return TutorId;
    }

    public String getSubjectName() {
        return SubjectName;
    }
}
