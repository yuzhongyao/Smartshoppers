package user;

import miscellaneous.Address;

public class User {
    private String firstName;
    private String lastName;
    private Address address;
    private Account account;

    public User(String first, String last, Address address) {
        this.firstName = first;
        this.lastName = last;
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }






}
