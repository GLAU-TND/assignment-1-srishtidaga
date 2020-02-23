package definition;

import adt.MyConcADT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyContact implements MyConcADT {
    Scanner sc = new Scanner(System.in);

    private String getFirstName() {
        System.out.println("Please Enter the name of the Person");
        System.out.print("FirstName: ");
        String firstName = sc.next();
        return firstName;
    }

    private String getLastName() {
        System.out.print("LastName: ");
        String lastName = sc.next();
        return lastName;
    }

    private MylinkedList<String> GetContactNumbers() {
        MylinkedList<String> contactNumbers = new MylinkedList<>();
        System.out.print("ContactNumbers: ");
        String contactno = sc.next();
        while (true) {
            if (Pattern.matches("[0-9]+ ", contactno)) {
                contactNumbers.add(contactno);
                break;
            } else {

                System.out.println("Invalid PhoneNumber");
                break;
            }
        }
        while (true) {
            System.out.println("Do you want to add a new ContactNumber? (y/n) : ");
            String a = sc.next();
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a Valid Input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
                continue;
            }
            if (at == 'y') {
                System.out.println("ContactNumber: ");
                contactno = sc.next();
                if (Pattern.matches("[0-9] +", contactno)) {
                    contactNumbers.add(contactno);
                } else {
                    System.out.println("Invalid PhoneNumber");
                }
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter a Valid Input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
            }
        }
        return contactNumbers;

    }

    private String GetEmail() {
        String Email = null;
        while (true) {
            System.out.println("Do you want to add an email ? (y/n) :");
            String a = sc.next();
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a Valid Input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
                continue;
            }
            if (at == 'y') {
                System.out.println("Email Address: ");
                Email = sc.next();
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter a Valid Input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
            }

        }
        return Email;
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
