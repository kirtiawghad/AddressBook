package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("*** ADDRESS BOOK ***");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        int temp = -1;
        while(temp != 0){
            System.out.println("[ 1.AddContact 2.EditContact 3.DeleteContact 4.Display 99.Exit ]");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice){
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
