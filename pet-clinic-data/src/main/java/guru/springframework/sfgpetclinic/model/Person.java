package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        System.out.println("Checking git");
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
