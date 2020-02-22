package definition;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private MylinkedList<String> contactNumbers;

    public Person(String firstName, String lastName, String email, MylinkedList<String> contactNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumbers = contactNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public MylinkedList<String> getContactNumbers() {
        return contactNumbers;
    }
}
