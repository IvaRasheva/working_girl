package Task01_School;

public class Class implements Nameable {
    private Student[] students = new Student[] {};
    private Teacher[] teachers = new Teacher[] {};
    private String classID;


    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    @Override
    public void getName(String name) {

    }

    @Override
    public String toString() {
        return "This is class " + this.classID + ".";
    }
}
