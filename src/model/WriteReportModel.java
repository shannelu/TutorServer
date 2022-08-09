package ca.ubc.cs304.model;

public class WriteReportModel {
    private final int ReportNumber;
    private final int TutorId;

    public WriteReportModel(int ReportNumber, int TutorId) {
        this.ReportNumber = ReportNumber;
        this.TutorId = TutorId;
    }

    public int getReportNumber() {
        return ReportNumber;
    }

    public int getTutorId() {
        return TutorId;
    }
}
