package classesAndObjects;

public class PersonTest {
    public static void main(String[] args) {
            Person myPerson = new Person("Iva", 24);
        System.out.printf("Hello, I am %s. I am %d years old.%n", myPerson.name, myPerson.age);

            Person secondPerson = new Person("Stupid one");
        System.out.printf("Hello, I am %s.%n", secondPerson.name);

            Person thirdPerson = new Person();
        System.out.println("I am John Doe");

    }
}

