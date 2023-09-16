package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact;

    public AddressBook(){
        this.contact = contact;
    }

    public void addContact(){
        System.out.println("Enter the Contact Details:");
        System.out.print("Enter the First Name:");
        String firstName = sc.next();
        System.out.print("Enter the Last Name:");
        String lastName = sc.next();
        System.out.print("Enter the Address:");
        String address = sc.next();
        System.out.print("Enter the City Name:");
        String cityName = sc.next();
        System.out.print("Enter the State Name:");
        String stateName = sc.next();
        System.out.print("Enter the Zip Code:");
        int zipCode = sc.nextInt();
        System.out.print("Enter the Phone Number:");
        String phoneNumber = sc.next();
        System.out.print("Enter the Email ID:");
        String email = sc.next();

        contact = new Contact(firstName,lastName,address,cityName,stateName,zipCode,phoneNumber,email);
    }

    public void editContact(){
        System.out.print("Enter the contact first name to edit:");
        String editContactName = sc.next();

        if(contact.getFirstName().equals(editContactName)){
            System.out.println("contact found");

            System.out.println("Before editing...");
            System.out.println(contact.toString());

            //Edit different fields
            System.out.print("Enter the Last Name:");
            String lastName = sc.next();
            contact.setLastName(lastName);
            System.out.print("Enter the Address:");
            String address = sc.next();
            contact.setAddress(address);
            System.out.print("Enter the City Name:");
            String cityName = sc.next();
            contact.setCity(cityName);
            System.out.print("Enter the State Name:");
            String stateName = sc.next();
            contact.setState(stateName);
            System.out.print("Enter the Zip Code:");
            int zipCode = sc.nextInt();
            contact.setZip(zipCode);
            System.out.print("Enter the Phone Number:");
            String phoneNumber = sc.next();
            contact.setPhoneNumber(phoneNumber);
            System.out.print("Enter the Email ID:");
            String email = sc.next();
            contact.setEmail(email);

            System.out.println("After editing...");
            System.out.println(contact.toString());
        }else{
            System.out.println("contact not found");
        }
    }

}
