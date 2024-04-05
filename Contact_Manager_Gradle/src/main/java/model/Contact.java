package model;



import java.util.ArrayList;
import java.util.List;


public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;

    private List <EmailAddress> emailAddresses = new ArrayList<EmailAddress>();

    private List <PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    public Contact(String firstName, String lastName, String company, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public void addEmailAddres(EmailAddress emailAddress){
        emailAddresses.add(emailAddress);
    }

    public void addPhoneNumber(PhoneNumber phoneNumber){
        phoneNumbers.add(phoneNumber);
    }

    public List<EmailAddress> getEmailAddresses(){
        return this.emailAddresses;
    }

    public List<PhoneNumber> getPhoneNumbers(){
        return this.phoneNumbers;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString(){
        return "{\"firstName\" : \"" + firstName+ "\", \"lastName\": \"" + lastName + "\", \"company\": \"" + company + "\", \"jobtitle\": \""
                +jobTitle +"\",";
    }
}
