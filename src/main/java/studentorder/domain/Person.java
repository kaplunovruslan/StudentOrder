package studentorder.domain;

import java.time.LocalDate;

public abstract class Person {
    protected String surName;
    protected String givenName;
    private String patronymic;
    private LocalDate dataOfBirth;
    private Address address;

    public Person(){
        System.out.println("Person is created.");
    }

    public String getPersonString(){
        return surName + " " + givenName;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }
    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
