package definition;

import adt.MyConcADT;

import java.util.Scanner;

public class MyContact implements MyConcADT {
    Scanner sc = new Scanner(System.in);

    private String getFirstName() {
        System.out.println("Please Enter the name of the Person");
        System.out.print("FirstName: ");
        String firstName = sc.next();
        return firstName;
    }

    private String getLastName() {
        System.out.println("LastName: ");
        String lastName = sc.next();
        return lastName;
    }

    @Override
    public void addContact() {

    }

    @Override
    public void viewContacts() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }
}
