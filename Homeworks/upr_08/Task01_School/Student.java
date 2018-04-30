package Task01_School;

public class Student extends Person {

    private final int studentID;

    public Student(String name, int id) {
        super(name);
        this.studentID = id;
    }

    public String tellId(){
        return String.format("My ID is %d. ", getStudentID());
    }

    public int getStudentID() {
        return studentID;
    }
}
