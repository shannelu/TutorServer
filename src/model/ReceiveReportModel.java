package ca.ubc.cs304.model;

public class ReceiveReportModel {
    private final int ReportNumber;
    private final int StudentId;
    private final int UniStudentId;

    public ReceiveReportModel(int ReportNumer, int StudentId, int UniStudentId) {
        this.ReportNumber = ReportNumer;
        this.StudentId= StudentId;
        this.UniStudentId= UniStudentId;
    }

    public int getReportNumber() {
        return ReportNumber;
    }

    public int getStudentId() {
        return StudentId;
    }

    public int getUniStudentId() {
        return UniStudentId;
    }
}
