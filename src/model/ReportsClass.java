package ca.ubc.cs304.model;

public class ReportsClass {
    private final int ReportNumber;
    private final String ReportDesc;

    public ReportsClass (int ReportNumber, String ReportDesc) {
        this.ReportNumber = ReportNumber;
        this.ReportDesc = ReportDesc;
    }

    public String getReportDesc() {
        return ReportDesc;
    }

    public int getReportNumber() {
        return ReportNumber;
    }
}
