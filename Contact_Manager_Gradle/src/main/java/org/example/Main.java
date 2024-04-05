package org.example;

import model.Contact;
import model.EmailAddress;
import model.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        EmailAddress e1 = new EmailAddress("oflayan@miu.edu", "work");
        EmailAddress e2 = new EmailAddress("omar.flayan@gmail.com", "home");

        PhoneNumber n1 = new PhoneNumber("3098322511", "home");

        Contact c1 = new Contact("Omar", "Flayan", "Synopsys Inc", "R&D Engineer, Staff");


        EmailAddress e3 = new EmailAddress("az@miu.edu", "work");
        EmailAddress e4 = new EmailAddress("ahmad_zahi@gmail.com", "home");

        PhoneNumber n2 = new PhoneNumber("6416550909", "home");

        Contact c2 = new Contact("Ahmad", "Zahi", "Photon", "Software Engineer");

        EmailAddress e5 = new EmailAddress("aa@miu.edu", "work");
        EmailAddress e6 = new EmailAddress("ahmad_amarah@gmail.com", "home");

        PhoneNumber n3 = new PhoneNumber("7017462384", "home");

        Contact c3 = new Contact("Ahmad", "Amarah", "Z Solutions", "Software Engineer, senior");

        c1.addEmailAddres(e1);
        c1.addEmailAddres(e2);
        c1.addPhoneNumber(n1);
        contacts.add(c1);

        c2.addEmailAddres(e3);
        c2.addEmailAddres(e4);
        c2.addPhoneNumber(n2);
        contacts.add(c2);

        c3.addEmailAddres(e5);
        c3.addEmailAddres(e6);
        c3.addPhoneNumber(n3);
        contacts.add(c3);


        Collections.sort(contacts, Comparator.comparing(Contact::getLastName));

        System.out.println("[\n");
        for (Contact cont : contacts) {
            System.out.println(cont.toString());

            List<EmailAddress> emails = cont.getEmailAddresses();
            for (EmailAddress email : emails) {
                System.out.print(email.toString());
            }

            List<PhoneNumber> phoneNumbers = cont.getPhoneNumbers();
            for (PhoneNumber phoneNumber : phoneNumbers) {
                System.out.print(phoneNumber.toString());
            }
            System.out.println(",");
            System.out.println();

        }
        System.out.println("\n]");
    }
}
