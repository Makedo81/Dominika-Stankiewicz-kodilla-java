package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private int contactNo;
    private String email;
    private String address;

    public User(String name, String surname, int contactNo, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contactNo=" + contactNo +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
