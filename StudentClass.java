package Test;


public class StudentClass {
    private String Name;
    private String GPA;
    private String studentID;

    public StudentClass(String studentID, String name, String GPA) {
        Name = name;
        this.GPA = GPA;
        this.studentID = studentID;
    }

    public String toString() {
        return studentID + " " + Name + " " + GPA;
    }

}