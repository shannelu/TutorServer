package ca.ubc.cs304.model;

public class k_12Model {
    private final int StudentId;
    private final String StudentName;
    private final int Age;
    private final int Exams;
    private final int UniApplication;
    private final int SAT;
    private final int STS;
    private final int TutorId;

    public k_12Model(int StudentId, String StudentName, int Age, int Exams, int UniApplication, int SAT, int STS, int TutorId) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.Age = Age;
        this.Exams = Exams;
        this.UniApplication = UniApplication;
        this.SAT = SAT;
        this.STS = STS;
        this.TutorId = TutorId;
    }

    public int getTutorId() {
        return TutorId;
    }

    public int getSTS() {
        return STS;
    }

    public int getSAT() {
        return SAT;
    }

    public int getUniApplication() {
        return UniApplication;
    }

    public int getExams() {
        return Exams;
    }

    public int getAge() {
        return Age;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }
}
