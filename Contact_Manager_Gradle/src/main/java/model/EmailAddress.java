package model;




public class EmailAddress {


    private String email;
    private String label;

    public EmailAddress(String email, String label){
        this.label = label;
        this.email = email;
    }

    @Override
    public String toString(){
        return " \"email\": \""+ email + "\", \"label\": \"" +label+"\"";
    }
}
