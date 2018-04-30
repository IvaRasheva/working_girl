package classesAndObjects;

public class Person {
    //Class Fields
    String name;
    int age;

//    public static void main(String[] args) {
//        Person myPerson = new Person("", 0);
//        myPerson.greeting(myPerson);
//    }

    //Constructor I
    public Person(){
        this.name = "No name";
        this.age = -1;
    }

    //Constructor II
    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    //Constructor III
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Methods
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}





