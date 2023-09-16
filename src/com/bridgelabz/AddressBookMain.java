package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("*** ADDRESS BOOK ***");

        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
        addressBook.deleteContact();
    }
}
