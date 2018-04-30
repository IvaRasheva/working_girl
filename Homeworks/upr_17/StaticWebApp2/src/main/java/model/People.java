package model;

import java.time.LocalDate;

public class People {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private String profession;

    public People(String firstName, String lastName, LocalDate birthDate, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getProfession() {
        return profession;
    }
}
