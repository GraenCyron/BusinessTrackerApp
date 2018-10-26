package com.daicy.dto;

import javax.validation.constraints.NotNull;

public class CustomerDTO {

    private long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String contactNumber;

    protected CustomerDTO() {}

    public CustomerDTO(long id, @NotNull String firstName,
            @NotNull String lastName, @NotNull String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "CustomerDTO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", contactNumber=" + contactNumber
                + "]";
    }
}