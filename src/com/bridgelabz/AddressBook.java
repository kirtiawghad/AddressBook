package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    String addressBookName;
    List<Contact> contactList;

    public AddressBook(String addressBookName){
        this.addressBookName = addressBookName;
        contactList = new ArrayList<>();
    }

    public boolean isContactExists(String firstName){
        boolean flag = false;
        for (Contact contact : contactList) {
            if (firstName.equals(contact.getFirstName())) {
                flag = true;
            }
        }
        return flag;
    }

    public void addContact(){
        System.out.println("Enter the Contact Details:");
        System.out.print("Enter the First Name:");
        String firstName = sc.next();

        if(!isContactExists(firstName)) {
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

            Contact contact = new Contact(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, email);

            contactList.add(contact);
        }else{
            System.out.println(firstName + " Already exists in this address book");
        }
    }

    public void editContact(){
        System.out.print("Enter the contact first name to edit:");
        String editContactName = sc.next();
        boolean flag = false;

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(editContactName)) {
                flag = true;
                if (flag == true) {
                    System.out.println("[ 1.LastName 2.Address 3.City 4.State 5.Zip 6.PhoneNumber 7.Email 99.Exit ]");
                    System.out.print("Choose the field you want to edit:");
                    int editOption = sc.nextInt();
                    switch (editOption) {
                        case 1:
                            System.out.print("Edit Last Name:");
                            String lastNameEditValue = sc.next();
                            contactList.get(i).setLastName(lastNameEditValue);
                            break;
                        case 2:
                            System.out.print("Edit Address:");
                            String addressEditValue = sc.next();
                            contactList.get(i).setAddress(addressEditValue);
                            break;
                        case 3:
                            System.out.print("Edit City:");
                            String cityEditValue = sc.next();
                            contactList.get(i).setCity(cityEditValue);
                            break;
                        case 4:
                            System.out.print("Edit State:");
                            String stateEditValue = sc.next();
                            contactList.get(i).setState(stateEditValue);
                            break;
                        case 5:
                            System.out.print("Edit Zip:");
                            int zipEditValue = sc.nextInt();
                            contactList.get(i).setZip(zipEditValue);
                            break;
                        case 6:
                            System.out.print("Edit Phone Number:");
                            String phoneNumberEditValue = sc.next();
                            contactList.get(i).setPhoneNumber(phoneNumberEditValue);
                            break;
                        case 7:
                            System.out.print("Edit Email:");
                            String emailEditValue = sc.next();
                            contactList.get(i).setEmail(emailEditValue);
                            break;
                        case 99:
                            System.exit(99);
                            break;
                        default:
                            System.out.println("!! choose the correct edit option !!");
                            break;
                    }
                    break;
                } else {
                    flag = false;
                }

                if(contactList.size() == 0){
                    System.out.println("address book is empty");
                }
                else if (flag == false)
                    System.out.println(editContactName + " not found in address book");
            }
        }
    }

    public void deleteContact(){
        System.out.print("Enter the contact first name to delete:");
        String deleteContactName = sc.next();

        if(contactList.size() == 0){
            System.out.println("address book is empty");
        }
        else {
            boolean flag = false;
            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getFirstName().equals(deleteContactName)) {
                    flag = true;
                    contactList.remove(i);
                    System.out.println(deleteContactName + " removed from address book");
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag == false)
                System.out.println(deleteContactName + " not found in address book");
        }
    }

    public void displayContacts(){
        System.out.println("-------------------------------");
        if(contactList.size() == 0){
            System.out.println("Address book empty");
        }else {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(contactList.get(i).toString());
            }
        }
        System.out.println("-------------------------------");
    }

    public List<Contact> getContactByCity(String cityName) {
        return contactList.stream().filter(contact -> contact.getCity().equals(cityName)).toList();
    }

    public List<Contact> getContactByState(String stateName) {
        return contactList.stream().filter(contact -> contact.getState().equals(stateName)).toList();
    }

    public List<Contact> getContactList() {
        return contactList;
    }
       }
