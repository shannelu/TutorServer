package ca.ubc.cs304.model;

public class AvailabilitiesModel {
    private final int STS;
    private final String time;
    private final int Studentid;
    private final int UniStudentid;
    private final int Tutorid;


    public AvailabilitiesModel (int StudentTutorSet, String time, int Studentid, int UniStudentid, int Tutorid) {
        this.STS = StudentTutorSet;
        this.time = time;
        this.Studentid = Studentid;
        this.UniStudentid = UniStudentid;
        this.Tutorid = Tutorid;
    }

    public int GetSTS() {return STS;}

    public String GetTime() {return time;}

    public int GetStudentid() {return Studentid;}

    public int GetUniStudentid() {return UniStudentid;}

    public int GetTutorid() {return Tutorid;}

}
