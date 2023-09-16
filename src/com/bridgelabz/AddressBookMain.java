package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

    static HashMap<String, AddressBook> dictAddressBook = new HashMap<>();

    public static void createNewAddressBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Address Book:");
        String addressBookName = sc.next();
        if (dictAddressBook.containsKey(addressBookName)) {
            System.out.println("This Address Book Already exits");
        } else {
            AddressBook addressBookObject = new AddressBook(addressBookName);
            dictAddressBook.put(addressBookName, addressBookObject);
        }
    }

    public static void existingAddressBook(){
        Scanner sc = new Scanner(System.in);

        int temp = -1;
        while(temp != 0) {
            System.out.println("1.addContact 2.editContact 3.delete 4.displayContact 5.backtomain");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            if (choice == 5) break;

            System.out.print("Enter the name of existing Address Book:");
            String addressBookName = sc.next();
            if (dictAddressBook.containsKey(addressBookName)) {
                AddressBook addressBook = dictAddressBook.get(addressBookName);

                switch (choice) {
                    case 1:
                        addressBook.addContact();
                        break;
                    case 2:
                        addressBook.editContact();
                        break;
                    case 3:
                        addressBook.deleteContact();
                        break;
                    case 4:
                        addressBook.displayContacts();
                        break;
                    default:
                        System.out.println(" choose correct option");
                        break;
                }
            }
            else {
                System.out.println(addressBookName + " address book not found");
            }
        }

    }

    public static void displayAddressBook(){
        System.out.println();
        System.out.println("Existing address books are:");
        for (String addressBookNames : dictAddressBook.keySet()) {
            System.out.println(addressBookNames);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("*** ADDRESS BOOK ***");
        Scanner sc = new Scanner(System.in);

        int temp = -1;
        while(temp != 0){
            System.out.println("[ 1.NewAddressBook 2.ExistingAddressBook " +
                    "3.DisplayAddressBook 99.Exit ]");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    createNewAddressBook();
                    break;
                case 2:
                    existingAddressBook();
                    break;
                case 3:
                    displayAddressBook();
                    break;
                case 99:
                    temp = 0;
                    break;
                default:
                    System.out.println("!! choose valid option !!");
                    break;
            }
        }
    }
}
