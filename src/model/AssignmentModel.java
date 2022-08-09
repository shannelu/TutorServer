package ca.ubc.cs304.model;

import javax.management.loading.MLet;

public class AssignmentModel {
    private final int AssignNumber;
    private final String AssignDescription;
    private final int Mark;

    public AssignmentModel(int assignNumber, String assignDescription, int Mark){
        this.AssignNumber = assignNumber;
        this.AssignDescription = assignDescription;
        this.Mark = Mark;
    }

    public int getAssignNumber() {
        return AssignNumber;
    }

    public String getAssignDescription() {
        return AssignDescription;
    }

    public int getMark() {
        return Mark;
    }
}
