import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. View all contacts");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the new line character after the int input
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    viewContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void addContact() {
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email:");
        String email = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public static void editContact() {
        System.out.println("Enter the index of the contact to edit:");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume the new line character after the int input
        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index. Please try again.");
            return;
        }
        Contact contact = contacts.get(index);
        System.out.println("Enter the new name (press Enter to keep the same):");
        String name = scanner.nextLine();
        System.out.println("Enter the new phone number (press
