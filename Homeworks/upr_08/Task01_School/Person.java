package Task01_School;

public abstract class Person implements Nameable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void getName(String name){
        this.name = name;
    }

    public String introduction(){
        return String.format("My name is %s. ", name);
    }
}
