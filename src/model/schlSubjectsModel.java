package ca.ubc.cs304.model;

public class schlSubjectsModel {
    private final String SubjectName;

    public schlSubjectsModel(String SubjectName){
        this.SubjectName = SubjectName;
    }

    public String GetSubjectName() {
        return SubjectName;
    }
}
