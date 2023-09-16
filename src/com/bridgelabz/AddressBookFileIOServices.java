package com.bridgelabz;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class AddressBookFileIOServices {

    public void write(List<Contact> personDetailsList) {
        StringBuffer personContactBuffer = new StringBuffer();
        personDetailsList.forEach(person -> {
            String personDataString = person.toString().concat("\n");
            personContactBuffer.append(personDataString);
        });

        try {
            Files.write(Paths.get("C:\\Users\\vinit\\IdeaProjects\\AddressBook\\src\\main\\java\\com\\bridgelabz\\ContactsFile.txt"), personContactBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        try {
            Files.lines(new File("C:\\Users\\vinit\\IdeaProjects\\AddressBook\\src\\main\\java\\com\\bridgelabz\\ContactsFile.txt").toPath()).forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public long countEntries() {
        long count = 0;
        try {
            count = Files.lines(new File("C:\\Users\\vinit\\IdeaProjects\\AddressBook\\src\\main\\java\\com\\bridgelabz\\ContactsFile.txt").toPath()).count();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return count;
    }
}
