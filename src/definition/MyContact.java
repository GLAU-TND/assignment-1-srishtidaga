package definition;

import adt.MyConcADT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyContact implements MyConcADT {
    Scanner sc = new Scanner(System.in);
    MylinkedList<Person> MyContactsBook = new MylinkedList<>();
    MylinkedList<String> contactNumbers = new MylinkedList<>();

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

    private int compareFirstName(String FirstName) {
        int index = 0;
        if (MyContactsBook.size == 0) {
        } else {
            for (int i = 0; i < MyContactsBook.size; i++) {
                Person temp = MyContactsBook.getData(i);
                String name = temp.getFirstName();
                name = name.toLowerCase();
                FirstName = FirstName.toLowerCase();
                if (name.compareTo(FirstName) < 0) {
                    index++;
                } else if (name.compareTo(FirstName) == 0) {
                    return index;

                } else {
                    break;
                }

            }

        }
        return index;
    }

    @Override
    public void addContact() {
        System.out.println("You have to chosen to add a new contact: ");
        String firstName = getFirstName();
        String lastName = getFirstName();
        contactNumbers = GetContactNumbers();
        String Email = GetEmail();
        Person newContact;
        newContact = new Person(firstName, lastName, Email, contactNumbers);
        int index = compareFirstName(firstName);
        MyContactsBook.add(newContact, index);
        System.out.println("Contact Added SucessFully");
        System.out.println();
        System.out.println();

    }

    @Override
    public void viewContacts() {
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");

        for (int i = 0; i < MyContactsBook.size; i++) {
            Person response = MyContactsBook.getData(i);
            System.out.println(response);
        }
        System.out.println("Total Contacts: " + MyContactsBook.size);




    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }
}
