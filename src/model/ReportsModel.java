package ca.ubc.cs304.model;

public class ReportsModel {
    private final int ReportNumber;
    private final String ReportDesc;

    public ReportsModel (int ReportNumber, String ReportDesc) {
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
