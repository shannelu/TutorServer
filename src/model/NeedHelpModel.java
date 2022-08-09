package ca.ubc.cs304.model;

public class NeedHelpModel {
    private final int StudentId;
    private final int UniStudentId;
    private final String SubjectName;

    public NeedHelpModel(int StudentId, int UniStudentId, String SubjectName) {
        this.StudentId = StudentId;
        this.UniStudentId = UniStudentId;
        this.SubjectName = SubjectName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public int getUniStudentId() {
        return UniStudentId;
    }

    public int getStudentId() {
        return StudentId;
    }
}
