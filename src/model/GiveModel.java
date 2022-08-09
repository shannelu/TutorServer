package ca.ubc.cs304.model;

public class GiveModel {
    private final int AssignNumber;
    private final int StudentId;
    private final int UniStudentId;

    public GiveModel(int AssignNumber, int StudentId, int UniStudentId) {
        this.AssignNumber = AssignNumber;
        this.StudentId = StudentId;
        this.UniStudentId = UniStudentId;
    }

    public int getAssignNumber() {
        return AssignNumber;
    }

    public int getStudentId() {
        return StudentId;
    }

    public int getUniStudentId() {
        return UniStudentId;
    }
}
