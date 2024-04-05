package model;


public class PhoneNumber {
    private String phoneNo;
    private String label;

    public PhoneNumber(String phoneNo, String label){
        this.phoneNo = phoneNo;
        this.label = label;
    }

    @Override
    public String toString(){
        return ", \"phoneNumber\": \""+ phoneNo + "\", \"label\": \"" +label + "\" }";
    }
}
