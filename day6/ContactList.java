import java.util.Scanner;

class Contact {
    String name;
    String contactNumber;
    String email;
    Contact next;
    Contact() {}
    Contact (String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.next = null;
    }
}

public class ContactList {
    static Contact contact;

    static Contact addContact(Contact contact) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String na = in.nextLine();
        System.out.print("Enter number: ");
        String num = in.nextLine();
        System.out.print("Enter email: ");
        String em = in.nextLine();
        Contact newContact = new Contact(na, num, em);
        if (contact == null) {
            contact = newContact;
        }
        else {
            Contact temp = contact;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact Added");
        return contact;
    }

    static void searchContact() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name to Search : ");
        String name = in.nextLine();
        Contact p = contact;
        boolean found = false;
        while (p != null) {

            if (p.name.equals(name)) {
                found = true;
                System.out.println("Details: ");
                System.out.println(p.name + " " + p.contactNumber + " " + p.email);

                break;
            }
            p = p.next;
        }
        if (found == false) {
            System.out.println("Name not found!");
        }
    }

    static void displayContact() {
        System.out.println("Displaying All Contact Details");
        Contact p = contact;
        while (p != null) {
            System.out.println(p.name + " " + p.contactNumber + " " + p.email);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        contact = null;
        contact = addContact(contact);
        contact = addContact(contact);
        
        displayContact();

        searchContact();

    }

}
