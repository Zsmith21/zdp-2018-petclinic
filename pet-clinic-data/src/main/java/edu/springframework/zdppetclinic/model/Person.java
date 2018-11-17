package edu.springframework.zdppetclinic.model;

/**
 * The 'POJO' 'Plain/ordinary Java Object' for JPA (Saving)
 */
public class Person extends BaseEntity{

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
