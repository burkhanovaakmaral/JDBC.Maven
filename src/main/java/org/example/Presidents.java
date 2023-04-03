package org.example;



public class Presidents {
    private String name;
    private String lastName;
    private int age;
    private String presidentOfWhichCountry;
    private int accountOfPresident;


    public void add(Presidents presidents) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPresidentOfWhichCountry() {
        return presidentOfWhichCountry;
    }

    public void setPresidentOfWhichCountry(String presidentOfWhichCountry) {
        this.presidentOfWhichCountry = presidentOfWhichCountry;
    }

    public int getAccountOfPresident() {
        return accountOfPresident;
    }

    public void setAccountOfPresident(int accountOfPresident) {
        this.accountOfPresident = accountOfPresident;
    }

    @Override
    public String toString() {
        return "Presidents " +
                "name " + name +
                ", lastName " + lastName +
                ", age " + age +
                ", presidentOfWhichCountry " + presidentOfWhichCountry +
                ", accountOfPresident " + accountOfPresident;
    }
}
