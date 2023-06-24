import java.util.Scanner;

class Contact {
    String name;
    String contactNumber;
    String email;

    Contact (String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        
    }
}


class ContactList{
    Contact contact;
    ContactList next;

    ContactList (Contact contact) {
        this.contact = contact;
        this.next = null;

    }

}




public class ContactListManagement {
    static ContactList head;
    static Contact contact;

    static ContactList addContact(Contact contact) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String na = in.nextLine();
        System.out.print("Enter number: ");
        String num = in.nextLine();
        System.out.print("Enter email: ");
        String em = in.nextLine();
        Contact newContact = new Contact(na, num, em);
        ContactList newlist = new ContactList(newContact);

        if (head == null) {
            head = newlist;
        }
        else {
            ContactList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newlist;
        }
        System.out.println("Contact Added");
        return head;
    }

    static void searchContact() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name to Search : ");
        String name = in.nextLine();
        ContactList p = head;
        boolean found = false;
        while (p != null) {

            if (p.contact.name.equals(name)) {
                found = true;
                System.out.println("Details: ");
                System.out.println(p.contact.name + " " + 
                p.contact.contactNumber + " " + p.contact.email);

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
        ContactList p = head;
        while (p != null) {
            System.out.println(p.contact.name + " " + 
            p.contact.contactNumber + " " + p.contact.email);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        head = null;
        head = addContact(contact);
        head = addContact(contact);
        
        displayContact();

        searchContact();

    }

}











