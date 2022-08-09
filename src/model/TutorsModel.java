package ca.ubc.cs304.model;

public class TutorsModel {
    private final int TutorId;

    private final String StudentName;

    private final int tAge;

    private final int Ratings;

    private final String SubjectName;

    private final int STS;

    public TutorsModel(int TutorId, String StudentName, int tAge, int Ratings, String SubjectName, int STS) {
        this.TutorId = TutorId;
        this.StudentName = StudentName;
        this.tAge= tAge;
        this.Ratings = Ratings;
        this.SubjectName = SubjectName;
        this.STS = STS;
    }

    public int getSTS() {
        return STS;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public int getRatings() {
        return Ratings;
    }

    public int gettAge() {
        return tAge;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getTutorId() {
        return TutorId;
    }
}
