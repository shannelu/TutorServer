package ca.ubc.cs304.model;

public class UniversityModel {
    private final int GetStudentId;
    private final String StudentName;
    private final int Age;
    private final int LSAT;
    private final int MCAT;
    private final int BAR;
    private final int STS;
    private final int TutorId;

    public UniversityModel(int GetStudentId, String StudentName, int Age, int LSAT, int MCAT, int BAR, int STS, int TutorId) {
        this.GetStudentId = GetStudentId;
        this.StudentName = StudentName;
        this.Age = Age;
        this.LSAT = LSAT;
        this.MCAT = MCAT;
        this.BAR = BAR;
        this.STS = STS;
        this.TutorId = TutorId;
    }

    public int GetStudentId() { return GetStudentId; }

    public String GetStudentName() { return StudentName; }

    public int GetAge() { return Age; }

    public int GetLSAT() {return LSAT; }

    public int GetMCAT() {
        return MCAT;
    }

    public int GetBAR() {
        return BAR;
    }

    public int GetSTS() {
        return STS;
    }

    public int GetTutorId() {
        return TutorId;
    }
}
