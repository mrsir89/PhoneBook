package com.example5.app.spring.entity;

import java.util.List;



public interface PhoneBook {

    String getLastName();
    void setLastName(String lastName);

    String getFirstName();
    void setFirstName(String firstName);


    String getEmail();
    void setEmail(String email);

    List<Phone> getPhones();
    void setPhones(List<Phone> phone);




}



