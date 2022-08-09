package ca.ubc.cs304.model;

public class AvailabilitiesModel {
    private final int StudentTutorSet;
    private final String time;
    private final int Studentid;
    private final int UniStudentid;
    private final int Tutorid;


    public AvailabilitiesModel (int STS, String time, int Studentid, int UniStudentid, int Tutorid) {
        this.StudentTutorSet = STS;
        this.time = time;
        this.Studentid = Studentid;
        this.UniStudentid = UniStudentid;
        this.Tutorid = Tutorid;
    }

    public int GetSTS() {return StudentTutorSet;}

    public String GetTime() {return time;}

    public int GetStudentid() {return Studentid;}

    public int GetUniStudentid() {return UniStudentid;}

    public int GetTutorid() {return Tutorid;}

}
