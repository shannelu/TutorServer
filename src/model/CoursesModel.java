package ca.ubc.cs304.model;

public class CoursesModel {
    private final String CourseName;
    private final int GradeLevel;
    private final String SubjectName;

    public CoursesModel(String CourseName, int GradeLevel, String SubjectName) {
        this.CourseName = CourseName;
        this.GradeLevel = GradeLevel;
        this.SubjectName = SubjectName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getGradeLevel() {
        return GradeLevel;
    }

    public String getSubjectName() {
        return SubjectName;
    }
}
