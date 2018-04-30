package Task01_School;

public class Discipline implements Nameable {

    private int classesPerWeek;
    private String name;

    public Discipline(String name, int classesPerWeek) {
        this.name = name;
        this.classesPerWeek = classesPerWeek;
    }

    public int getClassesPerWeek() {
        return classesPerWeek;
    }

    @Override
    public String toString() {
        return this.name + " " + getClassesPerWeek() + " times per week. ";
    }

    @Override
    public void getName(String name) {
        this.name = name;
    }
}
