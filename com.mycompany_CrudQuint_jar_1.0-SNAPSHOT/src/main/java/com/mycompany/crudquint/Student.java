/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudquint;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author ramir
 */
public class Student {
    @JsonProperty("CED_EST")
    private String ID;
    @JsonProperty("NOM_EST")
    private String firstName;
    @JsonProperty("APE_EST")
    private String lastName;
    @JsonProperty("DIR_EST")
    private String address;
    @JsonProperty("TEL_EST")
    private String phone;
    
    public Student(){}

    public Student(String ID, String firstName, String lastNamee, String address, String phone) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastNamee;
        this.address = address;
        this.phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
}
