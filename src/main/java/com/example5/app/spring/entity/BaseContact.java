package com.example5.app.spring.entity;

import java.util.List;

public interface BaseContact{

    String getId();
    void setId(String id);

    String getLastName();
    void setLastName(String lastName);

    String getFirstName();
    void setFirstName(String firstName);

    String getEmail();
    void setEmail(String email);

    List<Phone> getPhones();
    void setPhones(List<Phone> phone);

}
