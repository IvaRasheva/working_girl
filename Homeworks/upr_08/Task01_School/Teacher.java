package Task01_School;

public class Teacher extends Person {
    private Discipline [] disciplines;

    public Teacher(String name, Discipline[] disciplines) {
        super(name);
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("I am teaching ");
        for (Discipline disc : disciplines)
            str.append(disc);
        return str.toString();
    }
}
