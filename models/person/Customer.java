package models.person;

import models.person.Person;

public class Customer extends Person {
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String type ;

    public Customer() {
    }



    public Customer(int id,
                    String name,
                    String dateOfBirth,
                    String address,
                    String gender,
                    String idCard,
                    String phoneNumber,
                    String email,
                    String type) {
        super(id, name, dateOfBirth, address);
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +
                ", gender= " + gender +
                ", idCard= " + idCard +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email +
                ", type= " + type ;
    }
    public String writeToFile(){
        return super.writeToFile()+","+
                    gender +
                "," + idCard +
                "," + phoneNumber +
                "," + email +
                "," + type ;

    }
}
